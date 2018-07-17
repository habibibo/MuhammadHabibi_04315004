package com.derrypradi.appgis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import java.net.URL
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.MarkerOptions
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import com.google.gson.JsonObject



class MapsDiponegoro : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapsdriyorejo)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap

        //val gson = GsonBuilder().setPrettyPrinting().create()
        //val result = URL("http://192.168.43.108/gismaps/getjson/getlonglat.php").readText()
        //val jsonPerson: String = gson.toJson(result)

        //var jobj = Gson().fromJson(result, JsonObject::class.java)
        //var mid = jobj.get("id").getAsString()
        //var mname = jobj.get("name").getAsString()
        //var mlatitude = jobj.get("latitude").getAsString()
        //var mlongitude = jobj.get("longitude").getAsString()


        val p = LatLng(-7.2846959, 112.7311984)
        mMap.addMarker(MarkerOptions().position(p).title("Marker in Jl Diponegoro"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p))
    }

}