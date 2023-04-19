package com.instructor.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Video 1
    // on Create methodun icine yazdigimiz hersey uygulama baslamadan once logcat kisminda gozukur
/*
        println("HELLO KOTLIN")
        println("HELLO ANDRO")
        println(3*5)
*/
        //Video-2
        //Kotlin degiskenleri
        //1- var (Variable)
        //var javadaki butun degisken tiplerini karsiliyor

        var adam=3
        var madam=5
        var saydam="sessiz"
        var sayildam='a'
        var dy=true
        var yd=false
        var sayii=1.5
        var sayiii= 1.0E29
        println(adam+madam)
        println(madam*madam)
        println(sayii*sayiii)

        //2-val (Value-Sabit Value)
        val a=2
        //a=3


        //video 3
        var sas="selam"
        var bas="kelam"
    println("SELAMUN ALEYKum $sas $bas Origin bir ozellikmis hea")
    println("SELAMUN ALEYKum $sas ${bas.uppercase()} Origin bir ozellikmis hea")

        val isim : String
        //isim=123
        isim="Selami"
        val cisim: Int
        //cisim="selami"
        cisim=123

        //video 4
        val inta: Int=3
        //inta=45
        var intb: Int=5
        //intb =5.5
        intb=9

        //video 6
        //Diziler Arrays


        var array= arrayOf("Mehmet", "Selami",1,2,3)
        println(array[1])

        array[1]="Hasan"
        println(array[1])
        array.set(1,"Suleyman")

        var intArr= intArrayOf(1,2,3,4,5,)

        //intArr[5]=7  >> Hata verir cunku dizilerin arraylerin eleman sayisini artiramiyoruz
        //Sadece mevcut olanlari degistirebiliyoruz

        var dbArr= doubleArrayOf()

        //Eger onCreate isleminde hatali bi cagirim yaparsak uygulama cokuyor
        //Video 7


    }
}