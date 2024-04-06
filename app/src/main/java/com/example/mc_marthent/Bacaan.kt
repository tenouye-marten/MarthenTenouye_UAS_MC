package com.example.mc_marthent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mc_marthent.databinding.ActivityBacaanBinding
import com.example.mc_marthent.databinding.ActivityDetaiilBacaanBinding
import com.example.mc_marthent.databinding.ActivityMainBinding

class Bacaan : AppCompatActivity() {
    private lateinit var binding: ActivityBacaanBinding
    private lateinit var dataRecyclerView: RecyclerView
    private lateinit var Bjudul: Array<String>
    private lateinit var Bayat: Array<String>

    private lateinit var Bgambar: Array<Int>

    private lateinit var Bdetail: Array<String>
    private lateinit var listBacaan: ArrayList<ItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacaan)
        binding = ActivityBacaanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profile.setOnClickListener {
            val profile = Intent(this, Profile::class.java)
            startActivity(profile)
        }


        Bgambar = arrayOf(
            R.drawable.bible,
            R.drawable.bible,
            R.drawable.bible,
            R.drawable.bible,
            R.drawable.bible,
            R.drawable.bible
        )

        Bjudul = arrayOf(
            "Yesus mengubah air menjadi anggur",
            "Yesus mengubah air menjadi anggur",
            "Yesus mengubah air menjadi anggur",
            "Yesus mengubah air menjadi anggur",
            "Yesus mengubah air menjadi anggur",
            "Kisah kelahiran juruselamat di yerusalem"
        )
        Bayat = arrayOf(
            "yohanes 2 : 1-11",
            "yohanes 2 : 1-11",
            "yohanes 2 : 1-11",
            "yohanes 2 : 1-11",
            "yohanes 2 : 1-11",
            "Lukas 2 : 11"
        )

        Bdetail = arrayOf(
            getString(R.string.anggur),
            getString(R.string.anggur)
        )

        dataRecyclerView = findViewById(R.id.isidata)
        dataRecyclerView.layoutManager = LinearLayoutManager(this)

        listBacaan = arrayListOf<ItemData>()
        getData()


    }

    private fun getData() {
        for (i in Bgambar.indices) {
            val dataBacaan = ItemData(Bgambar[i], Bjudul[i], Bayat[i])
            listBacaan.add(dataBacaan)
        }


        var adapter = MyAdapter(listBacaan)
        dataRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@Bacaan, DetaiilBacaan::class.java)
                intent.putExtra("img", listBacaan[position].gambar)
                intent.putExtra("jdl", listBacaan[position].judul)
                intent.putExtra("ayt", listBacaan[position].ayat)
                intent.putExtra("dtl", Bdetail[position])
                startActivity(intent)

            }

        })


    }

}
