package com.instructor.handlerrunnableprojesi
import com.instructor.handlerrunnableprojesi.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    var no=0
    var runnable: Runnable=Runnable{}

    var handler:Handler = object : Handler() {

    }

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
    }
    fun baslat(view : View){
       no=0
        runnable=object:Runnable{

            override fun run() {
                no++
                binding.sayac.text="Sayac: ${no}"
                handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)
    }

    fun durdur(view: View){

        handler.removeCallbacks(runnable)
        no=0
        binding.sayac.text="Sayac: 0"

    }

}