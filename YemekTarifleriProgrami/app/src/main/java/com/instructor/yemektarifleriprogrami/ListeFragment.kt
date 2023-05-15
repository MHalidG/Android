package com.instructor.yemektarifleriprogrami

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.instructor.yemektarifleriprogrami.databinding.FragmentListeBinding
import kotlin.Exception

class ListeFragment : Fragment(R.layout.fragment_liste) {

    lateinit var binding:FragmentListeBinding
    var yemekIsmiListesi=ArrayList<String>()
    var yemekIdListesi=ArrayList<Int>()
    private lateinit var listeAdapter:ListeRecyclerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listeAdapter= ListeRecyclerAdapter(yemekIsmiListesi,yemekIdListesi)
        binding.recyclerView.layoutManager=LinearLayoutManager(context)
        binding.recyclerView.adapter=listeAdapter


    sqlVeriAlma()
    }


    fun sqlVeriAlma(){
        try {
            activity?.let {
                val db=it.openOrCreateDatabase("Yemekler", Context.MODE_PRIVATE,null)

                val cursor= db.rawQuery("SELECT * FROM yemekler",null)
                val yemekIsmiIndex=cursor.getColumnIndex("yemekIsmi")
                val yemekIdIndex=cursor.getColumnIndex("id")
                yemekIsmiListesi.clear()
                yemekIdListesi.clear()

                while (cursor.moveToNext()){

                    yemekIsmiListesi.add(cursor.getString(yemekIsmiIndex))
                    yemekIdListesi.add(cursor.getInt(yemekIdIndex))


                }
                listeAdapter.notifyDataSetChanged()
            cursor.close()
            }


        }catch (e:Exception){
            e.printStackTrace()
        }
  }

}