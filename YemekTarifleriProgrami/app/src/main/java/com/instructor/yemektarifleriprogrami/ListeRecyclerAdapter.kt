package com.instructor.yemektarifleriprogrami

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.instructor.yemektarifleriprogrami.databinding.RecyclerRowBinding

class ListeRecyclerAdapter(val yemekListesi:ArrayList<String>,
           val idListesi:ArrayList<Int>):RecyclerView.Adapter<ListeRecyclerAdapter.YemekHolder>() {

    lateinit var binding: RecyclerRowBinding


    class YemekHolder(itemView: View):RecyclerView.ViewHolder(itemView){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
       val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.recycler_row,parent,false)

        return YemekHolder(view)
    }

    override fun getItemCount(): Int {
        return yemekListesi.size
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
        binding.recyclerRowText.text=yemekListesi[position]
        binding.recyclerRowText.setOnClickListener{

            val action=ListeFragmentDirections.actionListeFragmentToTarifFragment("recyclerdangeldim",idListesi[position])
            Navigation.findNavController(it).navigate(action)
        }

    }

}