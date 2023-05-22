package com.example.riotracker_00026521.ui.rio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.riotracker_00026521.R
import com.example.riotracker_00026521.data.model.RioModel
import com.example.riotracker_00026521.databinding.FragmentRioBinding

class RioFragment : Fragment() {
    private lateinit var binding: FragmentRioBinding

    private val rioViewModel : RioViewModel by activityViewModels {
        RioViewModel.Factory
    }

    private fun showSelectedItem(river : RioModel){
        rioViewModel.setSelectedRivers(river)
        findNavController().navigate(R.id.action_rioFragment_to_rioInfoFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {
        binding = FragmentRioBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun displayMovies(){

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}