package com.jonbowring.papercalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.jonbowring.papercalculator.databinding.FragmentTitleBinding

class FragmentTitle : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // When the fragment view is created initialise a binding for accessing the layout elements
        // and inflate the fragment layout
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        // Add an onclick listener to the multiply button
        binding.multiply.setOnClickListener { view: View ->
            // TODO add navigation to the multiplication fragment
            // view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }

        // Return the inflated binding
        return binding.root
    }
}