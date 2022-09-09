package com.unguided.ugd3_15.entity

class Toko (var title: String, var jenisToko:String, var rating: Double){

    companion object{
        @JvmField
        var listOfToko = arrayOf(
            Toko("Karyani13", "Pakaian", 4.9),
            Toko("laku.grosir89", "Elektronik", 4.7),
            Toko("laamiahijab", "Makeup", 4.8),
            Toko("satu.is.one", "Pakaian", 4.6),
            Toko("ventelacimahi","Sepatu",4.9),
            Toko("aneka.listrik", "Elektronik", 4.7),
            Toko("rkking_99", "Elektronik", 3.8),
            Toko("cilily", "Pakaian", 4.6),
            Toko("whiteblacks", "Makeup", 4.8),
            Toko("ajwjei", "Elektronik", 4.9)
        )
    }
}