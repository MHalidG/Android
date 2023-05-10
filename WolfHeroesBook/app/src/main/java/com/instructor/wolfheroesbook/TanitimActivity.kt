package com.instructor.wolfheroesbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.instructor.wolfheroesbook.databinding.ActivityMainBinding
import com.instructor.wolfheroesbook.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {
    lateinit var binding:ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tanitim)
        binding= ActivityTanitimBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        val intent=intent
        val secilanKahraman=intent.getStringExtra("kahramaninIsmi")
        binding.textView.text=secilanKahraman



    }
}