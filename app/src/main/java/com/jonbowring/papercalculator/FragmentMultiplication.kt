package com.jonbowring.papercalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.jonbowring.papercalculator.databinding.FragmentMultiplicationBinding

class FragmentMultiplication : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Get and inflate the fragment binding
        val binding: FragmentMultiplicationBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_multiplication, container, false)

        // Get the numbers passed into the fragment
        val args = FragmentMultiplicationArgs.fromBundle(requireArguments())

        // TODO delete the below test
        Toast.makeText(context,
        "${args.num1} * ${args.num2}",
            Toast.LENGTH_LONG
            ).show()

        // Return the binding
        return binding.root
    }

}