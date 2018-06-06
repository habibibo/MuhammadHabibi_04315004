package com.example.bibo.appgis

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c:Calendar = Calendar.getInstance()
        val year:Int = c.get(Calendar.YEAR)
        val month:Int = c.get(Calendar.MONTH)
        val day:Int = c.get(Calendar.DAY_OF_MONTH)

        idhari.text = "$day/$month/$year"


    }
/*** masih error pak di codingannya , kemungkinan ada yang beda di versi kotlin nya, noted Habibi
    fun readData(rowid:Any,context:Any): MutableList<ArrayModel>{
    val list = ArrayList<ArrayModel>()
    val teks : String = idlokasi.text.toString()
        list.add(ArrayModel(rowid:1,lokasi:"ITATS", long:"-7.289241", lat:"112.778776"));
        list.add(ArrayModel(rowid:1,lokasi:"ITATS", long:"-7.288075", lat:"112.776449"));
        for (n : ArrayModel in list){
            if(teks== n.lokasi){
                id_Hasil_Long.setText(n.long)
                id_Hasil_Lat.setText(n.lat)
                Toast.makeText(context:this, text:"Data ditemukan",Toast.LENGTH_SHORT).show()


            }
        }
return list
    }
**/

}
