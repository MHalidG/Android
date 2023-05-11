package com.instructor.navigationkotlin

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.instructor.navigationkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragment= FragmentFirstBinding.inflate(layoutInflater)

        fragment.button1.setOnClickListener{
            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment2()
            Navigation.findNavController(it).navigate(action)
        }
    }
}