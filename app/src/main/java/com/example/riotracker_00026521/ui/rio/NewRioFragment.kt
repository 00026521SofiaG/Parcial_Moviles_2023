package com.example.riotracker_00026521.ui.rio

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.riotracker_00026521.databinding.FragmentNewrioBinding

class NewRioFragment : Fragment() {

    private lateinit var binding : FragmentNewrioBinding

    private val rioViewModel : RioViewModel by activityViewModels {
        RioViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewrioBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        observerStatus()
    }

    private fun setViewModel(){
        binding.viewmodel = rioViewModel
    }

    private fun observerStatus(){
        rioViewModel.status.observe(viewLifecycleOwner){
            status -> when {
                status.equals(RioViewModel.WRONG_INFORMATION) -> {
                    Log.d(APP_TAG, status)
                    rioViewModel.clearStatus()
                }
            status.equals(RioViewModel.RIVER_CREATED) -> {
                Log.d(APP_TAG, status)
                Log.d(APP_TAG, rioViewModel.getRivers().toString())
                rioViewModel.clearStatus()
                findNavController().popBackStack()
            }
            }
        }
    }

    companion object {
        const val APP_TAG = "APP TAG"
    }
}