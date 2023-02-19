package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var sonuc = MutableLiveData<String>() //bu değişken bir liveData oldu. tektiklenebilir.

    init {
        sonuc = MutableLiveData<String>("0") //varsayılan değeri 0 demek için yaptık.
    }

    fun toplamaYap(alinanSayi1:String,alinanSayi2:String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplam = sayi1 + sayi2
        sonuc.value = toplam.toString() //value live datadan dolayı
    }

    fun carpmaYap(alinanSayi1:String,alinanSayi2:String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val carpim = sayi1 * sayi2
        sonuc.value = carpim.toString() //value live datadan dolayı
    }
}