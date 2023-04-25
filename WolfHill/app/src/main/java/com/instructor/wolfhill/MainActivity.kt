package com.instructor.wolfhill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.instructor.wolfhill.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
    }
    fun kahramanOlustur(view : View){

        val isim=binding.isimText.text.toString()
        val yas=binding.yasText.text.toString().toIntOrNull()
        val meslek=binding.meslekText.text.toString()

        if (yas==null){
            binding.sonucText.text="Yasi dogru yaziniz lutfen"
        }else{
            val kahraman=Kahraman(isim,yas,meslek)
            binding.sonucText.text="Isim: ${kahraman.isim} Yas: ${kahraman.yas} Meslek: ${kahraman.meslek}"

        }
      }
}