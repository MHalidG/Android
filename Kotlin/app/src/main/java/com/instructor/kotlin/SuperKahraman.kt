package com.instructor.kotlin

class SuperKahraman(var isim:String,var yas:Int, var meslek:String) {
//Primary Constructor asagidaki butun ioslemlerin yerine yukarda tek satirda hallettik

    var sacRengi="Sapsari"
    fun testFunction(){
        println("Test Calisti")
    }


    fun sacRenginiAl(): String{
        return this.sacRengi
    }

    //Access Levels- Erisebilirlik Seviyeleri
    //Private- Protected- Internal -Public

    //Private= Sadece sinif ici
    //Protected= Sinif ici ve packet icinde kulanilir
    //Internal=Sadece projemizin icinde erisilebilir
    //Public= Open herkese acik

  /*  //Property
    var isim=""
    var yas=0
    var meslek=""

    //Constructor
    constructor(isim:String,yas:Int, meslek: String){
        this.isim=isim
        this.yas=yas
        this.meslek=meslek
    println("Constructor Cagirildi")
    }*/


}