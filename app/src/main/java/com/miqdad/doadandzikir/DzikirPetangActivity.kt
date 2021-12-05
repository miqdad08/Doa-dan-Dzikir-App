package com.miqdad.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.doadandzikir.adapter.DzikirDoaAdapter

class DzikirPetangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_petang)

     val rvDzikirPetang = findViewById<RecyclerView>(R.id.rv_dzikir_petang)
     rvDzikirPetang.layoutManager = LinearLayoutManager(this)
     rvDzikirPetang.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPetang)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}