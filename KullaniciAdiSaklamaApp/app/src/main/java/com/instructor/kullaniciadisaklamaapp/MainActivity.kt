package com.instructor.kullaniciadisaklamaapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.instructor.kullaniciadisaklamaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //var sharedPreferences: SharedPreferences?=null
    lateinit var sharedPreferences: SharedPreferences
    var alinanKullaniciAdi:String ?=null    //lateinit ben bunu onCreate de tanimlayacagim hata verme lutfen durumlarinda bu kullanilir
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        //SharedPreferences
        //xml dosyasinda tutuyor veriyi ilkel bir yapi
        sharedPreferences= this.getSharedPreferences("com.instructor.kullaniciadisaklamaapp",
            MODE_PRIVATE)

        alinanKullaniciAdi=sharedPreferences.getString("kullanici","")
        if (alinanKullaniciAdi!=null){
            binding.textView.text="Kaydedilen Kullanici Adi ${alinanKullaniciAdi}"
        }
        //binding.button.setOnClickListener {  }

    }

    fun kaydet(view : View){

        val kullaniciAdi= binding.editText.text.toString()
        if (kullaniciAdi==""){
            Toast.makeText(this,"Lutfen Bir Deger Giriniz", Toast.LENGTH_LONG).show()
        }else{
            sharedPreferences.edit().putString("kullanici",kullaniciAdi).apply()
            binding.textView.text="Kaydedilen Kullanici Adi: ${kullaniciAdi}"


        }




    }

    fun sil(view : View){

        alinanKullaniciAdi=sharedPreferences.getString("kullanici","")


        if(alinanKullaniciAdi!=null){
            binding.textView.text="Kaydedilen Kullanici Adi:"
            sharedPreferences.edit().remove("kullanici").apply()
        }

    }

}