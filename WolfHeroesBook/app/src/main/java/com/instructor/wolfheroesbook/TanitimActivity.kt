package com.instructor.wolfheroesbook

import android.graphics.BitmapFactory
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

        val secilenKahramanGorseli=intent.getIntExtra("alfaGorselleri",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)
        /*
        val secilenKahraman=SingletonClass.SecilenKahraman
        val secilenGorsel=secilenKahraman.gorsel
        binding.imageView.setImageBitmap(secilenGorsel)
*/



    }
}