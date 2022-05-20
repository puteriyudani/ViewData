package com.puteriyudani.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyler.*

class RecylerActivity : AppCompatActivity() {
    //deklarasi
    var dataBuah =
        arrayOf("alpukat","durian","jambuair","manggis","strawberry")
    var dataGambar= arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyler)
        //custom adapter, nanti dibuatkan constructor di custom adapter
        var adapter = CustomAdapter(this, dataBuah, dataGambar)
        //buat layout manager
        var liner = LinearLayoutManager(applicationContext)
        //manggil listnya
        recylerview.adapter = adapter
        recylerview.layoutManager = liner
    }
}