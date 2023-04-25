package com.instructor.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.instructor.dortislemkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
    }
    fun topla(view: View){
        var sayi1=binding.sayi1.text.toString().toIntOrNull()
        var sayi2=binding.sayi2.text.toString().toIntOrNull()

        if(sayi1!=null && sayi2!=null){
            binding.sonucText.text="Toplam: ${(sayi1+sayi2)}"
        }else{
            binding.sonucText.text="Lutfen sayi giriniz"
        }

    }
    fun cikart(view: View){
        var sayi1=binding.sayi1.text.toString().toIntOrNull()
        var sayi2=binding.sayi2.text.toString().toIntOrNull()

        if(sayi1!=null && sayi2!=null){
            binding.sonucText.text="Kalan: ${(sayi1-sayi2)}"
        }else{
            binding.sonucText.text="Lutfen sayi giriniz"
        }

    }
    fun bol(view: View){
        var sayi1=binding.sayi1.text.toString().toDoubleOrNull()
        var sayi2=binding.sayi2.text.toString().toDoubleOrNull()

        if(sayi1!=null && sayi2!=null){
            binding.sonucText.text="Bolum: ${(sayi1/sayi2)}"
        }else{
            binding.sonucText.text="Lutfen sayi giriniz"
        }

    }
    fun carp(view: View){
        var sayi1=binding.sayi1.text.toString().toIntOrNull()
        var sayi2=binding.sayi2.text.toString().toIntOrNull()

        if(sayi1!=null && sayi2!=null){
            binding.sonucText.text="Carpim: ${(sayi1*sayi2)}"
        }else{
            binding.sonucText.text="Lutfen sayi giriniz"
        }

    }






}