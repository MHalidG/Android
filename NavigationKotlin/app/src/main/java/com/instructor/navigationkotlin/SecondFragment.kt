package com.instructor.navigationkotlin

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.instructor.navigationkotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {



override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val fragment = FragmentSecondBinding.inflate(layoutInflater)
    fragment.button2.setOnClickListener {
    val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
    Navigation.findNavController(it).navigate(action)
    }

}
}