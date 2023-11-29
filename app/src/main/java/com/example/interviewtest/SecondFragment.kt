package com.example.interviewtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interviewtest.databinding.FragmentSecondBinding

/**
 * Tasks todo:
 * Instantiate MainViewModel
 * Add click listener to change_color_button which invokes changeColor() from MainViewModel
 * Observe the value of bgColor and apply background color to bottom_box_two
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}