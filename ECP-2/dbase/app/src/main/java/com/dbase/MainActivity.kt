package com.dbase

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
//import java.util.sql.*
//import java.util.Properties

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maps1.setOnClickListener{
            val maintomap = Intent(this, MapsActivity::class.java)
            startActivity(maintomap)
        }
        merr.setOnClickListener{
            val maintomap = Intent(this, ActivityMerr::class.java)
            startActivity(maintomap)
        }
        pelangi.setOnClickListener{
            val maintomap = Intent(this, ActivityPelangi::class.java)
            startActivity(maintomap)
        }
        mastrip.setOnClickListener{
            val maintomap = Intent(this, ActivityMastrip::class.java)
            startActivity(maintomap)
        }
        wiyung.setOnClickListener{
            val maintomap = Intent(this, ActivityWiyung::class.java)
            startActivity(maintomap)
        }
        tandes.setOnClickListener{
            val maintomap = Intent(this, ActivityWiyung::class.java)
            startActivity(maintomap)
        }
        diponegoro.setOnClickListener{
            val maintomap = Intent(this, ActivityDiponegoro::class.java)
            startActivity(maintomap)
        }

    }


}
