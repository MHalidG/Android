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

        var arrList1= arrayListOf<String>("Selami","Hasooo", "Piccaso")
        println(arrList1[0])
        arrList1.add("FezokuOnr")
        arrList1.add("Fezo")
        arrList1.add("Herren")
        arrList1.add("Serbest")

        var arrListAll= arrayListOf<Any>(1,"asdasd",'@')

        var arrList1Cln=arrList1.clone()

        // Video 8
        //Set-HashSet
        println("Set-HashSet")

        //??Neden setleri val olarak create ediyoruz var olarak yapmiyoruz
        var myHashSett = HashSet<Any>()

        val mySet= setOf<Int>(3,5,7,5,5,7,8)
        println(mySet.size)

        myHashSett.add("Ogretmen")
        myHashSett.add(123)
        myHashSett.forEach {println(it)}


        //Video 9
        println("Map-HashMap")

        var isimArr= arrayOf<String>("Ali","Mehmet","Selami","Fezoku")
        var maasArr= arrayOf<Int>(9000,5000,5006,6004)

        println("${isimArr[0]} ${maasArr[0]}")

        var isimMap= HashMap<String,Int>()

        isimMap.put("Ali",3500)
        isimMap.put ("Mehmet",9880)

        println(isimMap["Ali"])

        var myHashMap= hashMapOf<String,Int>("Ozan" to 10,"Mehmet" to 90)
        println(myHashMap["Ozan"])


    }
}