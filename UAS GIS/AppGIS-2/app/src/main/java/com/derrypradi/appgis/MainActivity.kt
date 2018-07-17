package com.derrypradi.appgis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // loadQueryAll()

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        //**Menampilkan Tanggal (dd/mm/yyyy)**//
        //label.text = "$day/$month/$year"

        fun readData(): MutableList<ArrayModel> {


            val list = ArrayList<ArrayModel>()

            list.add(ArrayModel(1, "MERR", "-7.310234", "112.780363"))
            list.add(ArrayModel(2, "Jl Diponegoro", "-7.284653", "112.733355"))

            return list
        }

        //**Memanggil fungsi ArrayList**//
        //btnTampil.setOnClickListener{readData()}

        //**Fungsi untuk tombol "Clear All"**//
        //fun clearData() {
         //   etLokasi.setText("")
         //   tvLong.setText("")
         //   tvLat.setText("")
        //}

        //**Memanggil fungsi Clear All**//
        //btnClear.setOnClickListener{clearData()}

        //**Memindah activity_main ke map ITATS**//
        btnMapI.setOnClickListener{
            val maintomap = Intent(this, MapsActivity::class.java)
            startActivity(maintomap)
        }

        //**Memindah activity_main ke map Narotama**//
        btnMapN.setOnClickListener{
            val maintomap = Intent(this, MapsActivity2::class.java)
            startActivity(maintomap)
        }
        btnApiDriyorejo.setOnClickListener{
            val maintomap = Intent(this, MapsDiponegoro::class.java)
            startActivity(maintomap)
        }
        btnsqlitemastrip.setOnClickListener{
            val maintomap = Intent(this, SQLliteMastrip::class.java)
            startActivity(maintomap)
        }
    }

}
