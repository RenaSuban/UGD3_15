package com.unguided.ugd3_15.entity



class Star(var namaToko: String, var rating:  Double, var jenis: String) {
    companion object{
        @JvmField
        var listOfUser = arrayOf(
            Star("Toko1",4.9, "pakaian"),
            Star("Toko2", 4.9, "sepatu"),
            Star("Toko3", 4.8, "pakaian"),
            Star("Toko4", 4.7, "elektronik"),
            Star("Toko5", 4.8, "makeup"),
            Star("Toko6", 4.5, "elektronik"),
            Star("Toko7", 4.6, "sepatu"),
            Star("Toko8", 4.7, "tas"),
            Star("Toko9", 4.9, "makeup"),
            Star("Toko0", 4.6, "elektronik")
        )
    }
}