package com.instructor.wolfheroesbook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.instructor.wolfheroesbook.databinding.RecyclerRowBinding

class RecyclerAdapter (val alfalarListesi: ArrayList<String>,val kahramanGorselleri:ArrayList<Bitmap>)
    :RecyclerView.Adapter<RecyclerAdapter.AlfalarVH>() {

    lateinit var binding :RecyclerRowBinding



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlfalarVH {//2.adim
        //Inflater,LayoutInflater,MenuInflater
        //xml baglarken Inflater kullaniyoruz
       binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context))
        var itemView=binding.root

       // val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
       return AlfalarVH(itemView as LinearLayout)
    }

    override fun getItemCount(): Int {//1.adim
    return alfalarListesi.size
        //Bes kahraman oldugu icin direk 5 dondurebiliriz fakat bunu statik yapmamiz lazim
    }

    override fun onBindViewHolder(holder: AlfalarVH, position: Int) {//3.adim
       binding.recyclerViewTextView.text=alfalarListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("kahramaninIsmi",alfalarListesi.get(position))
            //Intentle kucuk veriler gonderilir/ 400-500kb buyuk veri sayilir

            val singleton=SingletonClass.SecilenKahraman
            singleton.gorsel=kahramanGorselleri.get(position)
            holder.itemView.context.startActivity(intent)


        }
    }


    class AlfalarVH(itemView: View):RecyclerView.ViewHolder(itemView) {

    }



}