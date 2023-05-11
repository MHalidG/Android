package com.instructor.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.instructor.fragmentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val view =binding.root
        setContentView(view)

        //Android Jetpack FrameWork
        /*Fragmentler aktivitelerden daha verimli.
        Bir aktivite icinde birden fazla fragment kurulabiliyor
        Aktivitelerden bagimsiz Fragmentlerin de kendi yasam donguleri var.*/

        binding.button.setOnClickListener{
            val fragmentManager=supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val firstFragment = BlankFragment()
            fragmentTransaction.replace(R.id.frameLayout, firstFragment).commitNow()
        }

        binding.button2.setOnClickListener{
            val fragmentManager=supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val firstFragment = BlankFragment2()
            fragmentTransaction.replace(R.id.frameLayout, firstFragment).commitNow()
        }

        binding.button3.setOnClickListener{
            val fragmentManager=supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            val firstFragment = BlankFragment3()
            fragmentTransaction.replace(R.id.frameLayout, firstFragment).commitNow()
        }
/*
        fun ilkFragman(view:View){

            val fragmentManager=supportFragmentManager
            val fragmentTransaction=fragmentManager.beginTransaction()

            val firstFragment=BlankFragment()
            fragmentTransaction.add(R.id.frameLayout,firstFragment).commitNow()


        }
*/
        fun ikinciFragman(view: View){
            val fragmentManager=supportFragmentManager
            val fragmentTransaction=fragmentManager.beginTransaction()

            val secondFragment=BlankFragment2()
            fragmentTransaction.add(R.id.frameLayout,secondFragment).commitNow()

        }


    }

}

