package com.instructor.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val benimDizim = arrayOf(3,8,11,19,24,7,3,2,5,7,3,1)
        val benimListem = arrayListOf<Int>()
        for (numara in benimDizim) { if (numara % 2 == 0) { benimListem.add(numara) } }
        for (eleman in benimListem) { println(eleman) } }}