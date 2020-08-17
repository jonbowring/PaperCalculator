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

    private var num1: Int = 0
    private var num2: Int = 0
    private var answer: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Get and inflate the fragment binding
        val binding: FragmentMultiplicationBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_multiplication, container, false)

        // Draw the layout screen
        drawLayout()

        // Return the binding
        return binding.root
    }

    fun drawLayout() {

        // Get the numbers passed into the fragment
        val args = FragmentMultiplicationArgs.fromBundle(requireArguments())

        // Calculate the answer
        num1 = args.num1.toInt()
        num2 = args.num2.toInt()
        answer = num1 * num2

        // Calculate the required number of cells
        val numRows = args.num2.length
        val numCols = answer.toString().length

    }

}