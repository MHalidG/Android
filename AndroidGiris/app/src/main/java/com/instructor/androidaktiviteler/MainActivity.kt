package com.instructor.androidaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.instructor.androidaktiviteler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        println("onCreate Cagrildi")

    }

    override fun onStart() {
        super.onStart()

        println("Start Cagrildi")
    }

    override fun onResume() {
        super.onResume()
        println("Resume Cagrildi")
    }


    override fun onPause() {
        super.onPause()
        println("Pause Cagrildi")
    }

    override fun onStop() {
        super.onStop()
        println("Stop Cagrildi")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Destroy Cagrildi")
    }







    //Aktivitelerde kullanicilara gosterecegimiz arayuzleri gosteriyoruz(Fragmanlar(Fragments) da bu ise yariyor)
    //Android Manifestte asagidaki kod blogu hangi aktivitenin tagleri arasindayse main aktivite odur
    /*
       <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

    */
    fun changeActivity(view : View){
        val kullaniciVerisi=binding.editText.text.toString()

        val intent= Intent(applicationContext,SecondActivity::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
        finish()
    }
}