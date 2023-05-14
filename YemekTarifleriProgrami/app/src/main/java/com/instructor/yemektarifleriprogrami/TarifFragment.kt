package com.instructor.yemektarifleriprogrami

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.instructor.yemektarifleriprogrami.databinding.FragmentTarifBinding
import java.io.ByteArrayOutputStream
import java.lang.Exception
import kotlin.Exception

class TarifFragment : Fragment(R.layout.fragment_tarif) {

    var secilenGorsel: Uri?=null
    var secilenBitmap: Bitmap?=null
    lateinit var viewW: FragmentTarifBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*button.setOnClickListener{
     kaydet(it)
     }*/
    }
    fun kaydet(view : View){
        //Sqlite Kaydet
        val yemekIsmi=viewW.yemekIsmiText.text.toString()
        val yemekMalzemeleri=viewW.yemekMalzemeText.text.toString()

        if(secilenBitmap!=null){
            val kucukBitmap=kucukBitmapOlustur(secilenBitmap!!,300)
            val outputStream=ByteArrayOutputStream()
            kucukBitmap.compress(Bitmap.CompressFormat.PNG,50,outputStream)

            val byteDizisi=outputStream.toByteArray()
            try {
                context?.let {
                    val db=it.openOrCreateDatabase("Yemekler", Context.MODE_PRIVATE,null)
                    db.execSQL("CREATE TABLE IF NOT EXISTS yemekler (id INTEGER PRIMARY KEY, yemekIsmi VARCHAR, yemekMalzmemesi VARCHAR, gorsel BLOB)")


                    val sqlString="INSERT INTO Yemekler(yemekIsmi, yemekMalzemesi,gorsel) VALUES(?, ?, ?)"
                    val statement=db.compileStatement(sqlString)
                    //sqlString icerisindek' uc soru isareti 1,2,3, olarak index numarasi alir
                    //Asagida her indeks numarasi yerine ne yazilacagi verildi parantez icinde/ Statement statik sql sorgusu yazmaya yaradi
                    statement.bindString(1,yemekIsmi)
                    statement.bindString(2,yemekMalzemeleri)
                    statement.bindBlob(3,byteDizisi)
                    statement.execute()

                }
               }catch (e:Exception){
                e.printStackTrace()
            }

        }

    }

    fun gorselSec(view:View){
        activity?.let{
        if(ContextCompat.checkSelfPermission(it.applicationContext,Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED){
            //izin verilmedi izin iste
            requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),1)
        }else{
            //izin verilmis galeriye git
            val galeriIntenti= Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galeriIntenti,2)
        }
    }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {

        if(requestCode==1){
            if(grantResults.size>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                //izni aldik
                val galeriIntent=Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivityForResult(galeriIntent,2)
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {


        if(requestCode==2&&resultCode== Activity.RESULT_OK&&data!=null){
            secilenGorsel=data.data
            try {
                context?.let {
                    if(secilenGorsel!=null) {
                        if(Build.VERSION.SDK_INT>=28) {
                            val source =ImageDecoder.createSource(it.contentResolver, secilenGorsel!!)
                            secilenBitmap=ImageDecoder.decodeBitmap(source)

                            viewW.imageView2.setImageBitmap(secilenBitmap)
                        }else{
secilenBitmap=MediaStore.Images.Media.getBitmap(it.contentResolver,secilenGorsel)
                        }
                    }

                }

            }catch (e:Exception){
                e.printStackTrace()
            }
        }

        super.onActivityResult(requestCode, resultCode, data)
    }

    fun kucukBitmapOlustur(kullanicininSectigiBitmap: Bitmap, maximumBoyut : Int): Bitmap {

        var width=kullanicininSectigiBitmap.width
        var height=kullanicininSectigiBitmap.height

        val bitmapOrani:Double=width.toDouble()/height.toDouble()

        if(bitmapOrani>1){
            //Gorsel Yatay
            width=maximumBoyut
            val kisaltilmisHeight=width/bitmapOrani
            height=kisaltilmisHeight.toInt()
        }else{
            //Gorsel Dikey
            height=maximumBoyut
            val kisaltilmisWidth=height*bitmapOrani
            width=kisaltilmisWidth.toInt()
        }


        return Bitmap.createScaledBitmap(kullanicininSectigiBitmap,width,height,true,)

    }


}