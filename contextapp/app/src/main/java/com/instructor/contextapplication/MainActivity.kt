package com.instructor.contextapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.instructor.contextapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        //Toast ve Alert mesajlari

        //applicationContext -> App context
        //this, this@MainActivity  -> Aktivite Contexti

        //Toast.makeText(this,"Hosgeldin!",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"Hosgeldin!",Toast.LENGTH_LONG).show()

    }

    fun mesajGoster(view: View){

        val uyariMesaji=AlertDialog.Builder(this@MainActivity)

        uyariMesaji.setTitle("Sifre Hatasi")
        uyariMesaji.setMessage("Sifreyi girmediniz bastan deniceniz mi")
        uyariMesaji.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Bastan Deniyorsunuz",Toast.LENGTH_LONG).show()
        })

        uyariMesaji.setNegativeButton("Hayir"){dialogInterface,i->
            Toast.makeText(this,"Hayir mi dedinla Deneme la o zaman",Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()
    }
}