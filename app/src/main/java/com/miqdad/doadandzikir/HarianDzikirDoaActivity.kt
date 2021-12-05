package com.miqdad.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.doadandzikir.adapter.DzikirDoa
import com.miqdad.doadandzikir.adapter.DzikirDoaAdapter

class HarianDzikirDoaActivity : AppCompatActivity() {

    private val listDzikir: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harian_dzikir_doa)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_harian_dzikir_doa)

        initData()

        val rvDzikirDoaHarian:  RecyclerView = findViewById(R.id.rv_dzikit_doa_harian)
        rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
        rvDzikirDoaHarian.adapter = DzikirDoaAdapter(listDzikir)

    }
    private fun initData(){
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz  = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in desc.indices) {
            var dzikir = DzikirDoa(
                desc[data],
                lafaz[data],
                terjemah[data]
                )
            listDzikir.add(dzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}