package com.instructor.wolfheroesbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.instructor.wolfheroesbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        //Cihangir //Melik //Kurt //Qira //Jura
        //Gorselleri kafamiza gore alip googleplayde kullanamayiz
        //royaltyfree image (Telifsiz gorsel)

        //Veri Hazirligi
        var alfalar=ArrayList<String>()

        alfalar.add("Cihangir")
        alfalar.add("Melik")
        alfalar.add("Kurt")
        alfalar.add("Qira")
        alfalar.add("Cahit")

        //Verimsiz tanimlamalar
        //Gorselleri internetten indirirken de veri olarak indiriyoruz pc onu gorsele ceviriyor
        //Biz de burda veriyi Variablea atiyoruz/
/*
        val leaderBitMap=BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cihangir)
        val melikBitMap=BitmapFactory.decodeResource(applicationContext.resources, R.drawable.malik)
        val kurtBitMap=BitmapFactory.decodeResource(applicationContext.resources, R.drawable.kurt)
        val qiraBitMap=BitmapFactory.decodeResource(applicationContext.resources, R.drawable.qira)
        val cahitBitMap=BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cahit)

        var alfalarGorsel= ArrayList<Bitmap>()
        alfalarGorsel.add(leaderBitMap)
        alfalarGorsel.add(melikBitMap)
        alfalarGorsel.add(kurtBitMap)
        alfalarGorsel.add(qiraBitMap)
        alfalarGorsel.add(cahitBitMap)

*/
        //Verimli Tanimlamalar
        val leaderDrawableId=R.drawable.cihangir
        val malikDrawableId=R.drawable.malik
        val kurtDrawableId=R.drawable.kurt
        val qiraDrawableId=R.drawable.qira
        val cahitDrawableId=R.drawable.cahit

        var alfalarDrawableListesi=ArrayList<Int>()

        alfalarDrawableListesi.add(leaderDrawableId)
        alfalarDrawableListesi.add(malikDrawableId)
        alfalarDrawableListesi.add(kurtDrawableId)
        alfalarDrawableListesi.add(qiraDrawableId)
        alfalarDrawableListesi.add(cahitDrawableId)



        //Adapter

        //RecyclerRowlar nasil gozukucek onu yapiyoruz

        val layoutManager=LinearLayoutManager(this)
        binding.recyclerView.layoutManager=layoutManager

        val adapter=RecyclerAdapter(alfalar,alfalarDrawableListesi)
        binding.recyclerView.adapter=adapter

    }



}