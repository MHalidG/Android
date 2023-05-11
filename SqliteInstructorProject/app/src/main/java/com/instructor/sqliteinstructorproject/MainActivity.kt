package com.instructor.sqliteinstructorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Try-Catch Yapilari

        try {

            val db=this.openOrCreateDatabase("DataBase", MODE_PRIVATE,null)

            //Create Database And Table And Column
          // db.execSQL("CREATE TABLE IF NOT EXISTS alfalar(id INTEGER PRIMARY KEY,isim VARCHAR,seviye INT)")

            //Insert Into Table
          // db.execSQL("INSERT INTO ALFALAR(isim,seviye) VALUES('Cihangir',99)")
          // db.execSQL("INSERT INTO ALFALAR(isim,seviye) VALUES('Malik',98)")
          // db.execSQL("INSERT INTO ALFALAR(isim,seviye) VALUES('Teymur',96)")
          // db.execSQL("INSERT INTO ALFALAR(isim,seviye) VALUES('Cahit',95)")
          // db.execSQL("INSERT INTO ALFALAR(isim,seviye) VALUES('Qira',98)")

            //Select * From
            val cursor=db.rawQuery("SELECT * FROM alfalar",null)
            //val cursor=db.rawQuery("SELECT * FROM alfalar WHERE isim LIKE 'C%'",null)
            //val cursor=db.rawQuery("SELECT * FROM alfalar WHERE id =5",null)
            //val cursor=db.rawQuery("SELECT * FROM alfalar WHERE isim ='Cahit'",null)


            //Delete Update Put
            //val cursor=db.rawQuery("DELETE FROM alfalar WHERE id =8",null)
            //db.execSQL("UPDATE alfalar SET seviye=100 WHERE isim='Cihangir'")
            //db.execSQL("UPDATE alfalar SET isim='Kurt' WHERE id=9")

          val idColumnIndex=cursor.getColumnIndex("id")
          val isimColumnIndex=cursor.getColumnIndex("isim")
          val seviyeColumnIndex=cursor.getColumnIndex("seviye")

           while (cursor.moveToNext()){
               println("ID: ${cursor.getInt(idColumnIndex)}")
               println("Isim: ${cursor.getString(isimColumnIndex)}")
               println("Seviye: ${cursor.getInt(seviyeColumnIndex)}")
           }

           cursor.close()

        }catch (e:Exception){
            e.printStackTrace()
        }



    }
}