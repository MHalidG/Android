package com.instructor.androidaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.instructor.androidaktiviteler.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_second)

        binding= ActivitySecondBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)


        val intent=intent
        val alinanVeri=intent.getStringExtra("yollananVeri")
            binding.textView2.text=alinanVeri
    }
    fun geriDon(view : View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}