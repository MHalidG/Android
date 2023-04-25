package com.instructor.arayuzogrenme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Layout Cesitleri
        //Layout icinde layout kullanilabilir tektip olmak zorunda degil

        //1-Constrait layout
        /*En sik kullanilan layout turu. En serbest calisma imkanini bu veriyor
        2-Linear Layout
        Tek cizgi hizaliyor dikey veya yatay ayarini yapmak gerekiyor
         android:orientation="vertical" yada horizental

         3-Relative layout
         Nesneler birbiriyle iliskilendirilerek konumladniriliyor
         rightOf: "@+id: buttom" gibi yazimlarda hangi nesnenin neresinde durcagi tanimlaniyor mesela

        4-FrameLayout Tek resim kullanacagimiz zaman kullaniyoruz

        5-Grid Layout
        indiriyoruz oncelikle gradle module app de dependencies altinda implemente oluyor
        layout_row(sira)
        layout_column(sutun)




         */

    }
}