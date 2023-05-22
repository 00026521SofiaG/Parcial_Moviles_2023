package com.example.riotracker_00026521.ui.rio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.riotracker_00026521.databinding.FragmentRioinfoBinding

class RioInfoFragment : Fragment() {

    private val rioViewModel: RioViewModel by activityViewModels {
        RioViewModel.Factory
    }

    private lateinit var binding: FragmentRioinfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRioinfoBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = rioViewModel
    }
}