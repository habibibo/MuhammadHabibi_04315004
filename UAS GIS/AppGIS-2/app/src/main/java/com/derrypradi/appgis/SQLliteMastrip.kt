package com.derrypradi.appgis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.MarkerOptions
import android.content.Context
import java.util.ArrayList

class SQLliteMastrip(context: Context): AppCompatActivity(), OnMapReadyCallback  {
//class SQLliteMastrip : AppCompatActivity(), OnMapReadyCallback  {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_sqllitemastrip)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    //private var listarea = ArrayList<SqliteModel>()
    //val dbManager = MyDB(context)
    //val db = dbManager.readableDatabase

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //val cursor = db.rawQuery("select * from mapstb", null)

        //val id = cursor.getInt(cursor.getColumnIndex("id"))
        //val NameArea = cursor.getString(cursor.getColumnIndex("namearea"))
        //val Latitudes = cursor.getString(cursor.getColumnIndex("latitudes"))
        //val Longitudes = cursor.getString(cursor.getColumnIndex("longitudes"))

        val p = LatLng(-7.2846959, 112.7311984)
        mMap.addMarker(MarkerOptions().position(p).title("Marker in Jl Mastrip via SQ Lite"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p))

    }
}