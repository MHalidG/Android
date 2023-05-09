package com.instructor.sayacprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.instructor.sayacprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() /*inheritance= AppCompatActivity Implement edilmis */{

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)


            //Abstract Classes
            object : CountDownTimer(15000,1000){
                override fun onTick(millisUntilFinished: Long) {
                    //Yukarida CountDownTimer icinde yazdigimiz ikinci deger bu fonksiyonun ne siklikla
                    //Calisacagini gosteriyor.
                    binding.textView.text="Kalan ${millisUntilFinished/1000}"
                }


                override fun onFinish() {
                    binding.textView.text="Kalan 0"
                }


            }.start()



        }


    }
