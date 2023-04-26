package com.instructor.kullaniciadisaklamaapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.instructor.kullaniciadisaklamaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //var sharedPreferences: SharedPreferences?=null
    lateinit var sharedPreferences: SharedPreferences
    //lateinit ben bunu onCreate de tanimlayacagim hata verme lutfen durumlarinda bu kullanilir
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        //SharedPreferences
        //xml dosyasinda tutuyor veriyi ilkel bir yapi

        var sharedPreferences= this.getSharedPreferences("com.instructor.kullaniciadisaklamaapp",
            MODE_PRIVATE)


    }

    fun kaydet(view : View){
        val kullaniciAdi=binding.editText.text.toString()
        sharedPreferences

    }

    fun sil(view : View){

    }

}