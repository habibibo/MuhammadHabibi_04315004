package com.dbase

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.Context
import android.content.ContentValues
import android.database.sqlite.SQLiteQueryBuilder
import android.util.Log
import java.util.ArrayList

class DatabaseHandler : SQLiteOpenHelper{

    companion object{
        val Tag = "DatabaseHandler"
        val DBName = "MapsDB"
        val DBVersion = 1

        val tableName = "mapsTable"
        val ConID = "id"
        val MName = "MNames"
        val Latitudes = "Latit"
        val Longitudes = "Longit"
    }
    var context : Context? = null
    var sqlObj: SQLiteDatabase

    constructor(context:Context):super(context,DBName,null,DBVersion){
        this.context = context;
        sqlObj = this.writableDatabase

    }

    override fun onCreate(p0 : SQLiteDatabase?){
        var sql1:String = "Create TABLE IF NOT EXISTS"+"tableName"+ " "
        "("+ ConID+"INTEGER PRIMARY KEY,"+MName+"TEXT,"+ Latitudes+"TEXT,"+ Longitudes+"TEXT);"

        p0!!.execSQL(sql1)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("Drop table IF EXISTS"+ tableName)
        onCreate(p0)
    }
    fun AddContact(values:ContentValues):String{
        var Msg : String = "error";
        val ID = sqlObj!!.insert(tableName,"",values)
        if(ID>0){
            Msg = "ok"
        }
        return Msg
    }

    fun FetchMaps(keyword:String):ArrayList<MapsData>{
        var arraylist = ArrayList<MapsData>()
        val sqb = SQLiteQueryBuilder()
        sqb.tables = tableName
        val cols = arrayOf("id","MNames","Latit","Longit")
        val rowSelArg = arrayOf(keyword)
        val cur = sqb.query(sqlObj,cols,"MNames like ?", rowSelArg, null, null, "MNames")

        if(cur.moveToFirst()){
            do{
                val id = cur.getInt(cur.getColumnIndex("id"))
                val MNames : String = cur.getString(cur.getColumnIndex("MNames"))
                val Latit : String = cur.getString(cur.getColumnIndex("Latit"))
                val Longit : String = cur.getString(cur.getColumnIndex("Longit"))

                arraylist.add(MapsData(id ,MNames ,Latit ,Longit))
            } while(cur.moveToNext())
        }
        var count : Int = arraylist.size
        return arraylist
    }

    fun UpdateMaps(values: ContentValues, id: Int): String {

        var selectionArs = arrayOf(id.toString())

        val i = sqlObj!!.update(tableName, values, "id=?", selectionArs)
        if (i > 0) {
            return "ok";
        } else {

            return "error";
        }
    }

    fun RemoveMaps(id: Int): String {

        var selectionArs = arrayOf(id.toString())

        val i = sqlObj!!.delete(tableName, "id=?", selectionArs)
        if (i > 0) {
            return "ok";
        } else {

            return "error";
        }
    }

}

