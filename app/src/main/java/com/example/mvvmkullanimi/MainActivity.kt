package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding //data binding için gerekli sınıftan gerekli değişkeni oluşturduk
    private val viewModel : MainActivityViewModel by viewModels() //ViewModel sınıfını buraya bağlamış olduk.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main) //bu kısım biraz ezbere başa tasarim = DataBindingUtil. kısmı geldi ve parantez içine this, geldi

        tasarim.mainActivityNesnesi = this //bu nesne mainActivity yetkisine sahip demiş olduk.


        viewModel.sonuc.observe(this,{ s ->
            tasarim.hesaplamaSonucu= s
        })

    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)
    }

    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)
    }

}