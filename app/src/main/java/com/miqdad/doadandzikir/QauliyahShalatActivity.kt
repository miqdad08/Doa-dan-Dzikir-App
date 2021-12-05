package com.miqdad.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.doadandzikir.adapter.DzikirDoaAdapter

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyyah: RecyclerView = findViewById(R.id.rv_qauliyyah_shalat)
        rvQauliyyah.layoutManager = LinearLayoutManager(this)
        rvQauliyyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyyah)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}