package com.instructor.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.instructor.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)

        val view =binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val cikarmaSnc=cikarma(80,88)
            binding.textView2.text="Sonuc ${cikarmaSnc}"
        }


        var superman=SuperKahraman("Superman",50,"Gazeteci")
        binding.textView2.text="Yas: ${superman.yas}"

        superman.testFunction()

        nullGuvenligi()

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

        //Burasi onemli. Atama yapilinca direk integr olarak define ediyor/
        //var benimLongum=100

        var benimLongum:Long=100
        benimLongum=633333333333333
        var benimInt=1000
        var benimLongaCevrilenIntim=benimInt.toLong()
        var isimm="50"

        var isimdenInte=isimm.toInt();


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

        //Video 10
        println("Operatorler")

        //++
        //--
        //<
        //>
        //<= >=
        //==
        //!=
        //&& ve. || veya

        var i=3
        i= i+1
        println(i)
        i++
        i++
        println(i)

        //% mod operatoru ayni java ile

        //Video 11
        println("If Else")
        val s1=70
        val s2=80
        val s3=90

        val ortalama=(s1+s2+s3)/3
        if(ortalama<=50){println("Kaldin len Saf")}
        else if(ortalama<=70){
            println("Len vasat ortalama adam seni")
        }else if(ortalama <=100){
            println("Helellen kerata aferim")
        }else{
            println("Olum Uyumsuzsun sen he")
        }

        //Video 12
        println("When(Switch)")

        var gun=1
        var gunStr="Bos"
        when(gun){
            1-> gunStr="Pazartesi"
            2-> gunStr="Sali"
            3-> gunStr="Crs"
            else -> gunStr="Bir gun iste"
        }

        //Video 13
        println("For loop")

        val names =ArrayList<String>()
        names.add("Halid")
        names.add("Fezoku")
        names.add("Cihangir")
        names.add("Aysenur")
        names.add("Cihat")

        for(String in names){
            println(String)
        }

        names.forEach{println(it)}

        //for(i:Int in 1..10) println(i)
        //for(i:Int in 1 until 10) println(i)
        //for(i:Int in 10 downTo 1) println(i)
        //for(i:Int in 10 downTo 1 step 2) println(i)
        //for(i:Int in 1.rangeTo(10).step(2)) println(i)

        for(i:Char in 'a'..'z') println(i)

        println("While Loop")

        var w=0
        while (w<10){
            println(w)
            w++
        }



        fun degistir(view  : View){


        }

            //textView.text = "Merhaba Android"
            //Burada bir hata ile karsilastik Artik Kotlin Android Extensions desteklenmiyormus
            //Bu rehberden yeni yolu ogrendim View Binding  https://www.youtube.com/watch?v=MW_IQkZEf1A

            /*buildFeatures{
                    viewBinding true
                }
           Adim 1 Yukaridaki eklendiyi build gradle module de andoridin altina yazdik

          Adim 2  Asagidaki blokta cift yildizli olan yerleri degistirdik


        lateinit var binding: ActivityMainBinding**
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)**(Bu satir yorum haline alindi)
        binding= ActivityMainBinding.inflate(layoutInflater)**
        val view =binding.root**
        setContentView(view)**

                Adim 3 : Butun bu islemerli yaptiktan sonra binding objesi uzerinden Idlere ulasabiliyoruz

                */
        cikarma(5,9)
        firstFunc()
    }

    fun firstFunc(){
        println("First Function Was Runned")
    }
/*
    fun cikarma(x:Int,y: Int): String{
        binding.textView2.text="Sonuc ${x-y}"

    return "Selami Amcaaa"
    }*/

    fun cikarma(x:Int,y: Int): Int{
        return x-y
    }
/*
    fun degistir(view : View){
        val cikarmaSonuc=cikarma(60,70)
        binding.textView2.text="Sonuc ${cikarmaSonuc}"

    }*/

    fun sinifCalismasi(){
        var numara=5
        var selami: Int=9
        var isim="Superman"
        var meslek="Gazeteci"
        var yas=50

        var SpiiderMan="Spiderman"
        var spiderMeslek="Gazeteci"
        var SpidermanYas=20
       /* var spiderman=SuperKahraman()
        spiderman.isim="SpiderMan"
        spiderman.meslek="Gazeteci"
        spiderman.yas=50
*/

    }

    fun nullGuvenligi(){
    //Null, Nullability, Null Safety

        //Tanilama, Definening
        var benimStr:String?

        //Initialization
        benimStr="Halid"
        var benimInt: Int?=null
        //Null degerini direk atamak gerekiyor nullability ayarlarken

        //var benimYas:Int?=null
        //println(benimYas*2)

        //Nullable Kontrol Methodlari

        //1
        if(benimStr!=null){
            println(benimStr)
        }else{
            println("Null Geldi")
        }

        //2
        //!! -> Null Olmayacak   ? -> Null olabilir
        println(benimInt!!.minus(2))

        //3
        //Elvis Operatoru
        val sonuc=benimInt?.minus(2) ?:10
        //Eger gelen sayi null sa otomatik olarak 10 degerini alacagiz
        println(sonuc)

        //4
        //let
        //Eger null degilsem birak beni islemi yapayim
        benimInt?.let {
            println(it*5)
        }



    }



}