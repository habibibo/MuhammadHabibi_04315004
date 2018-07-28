package com.dbase

class MapsData {

    var conID:Int?=null
    var MName:String?=null
    var Latitudes:String?=null
    var Longitudes:String?=null

    constructor(id:Int,MNames:String,Latit:String,Longit:String) {
        this.conID = id
        this.MName = MNames
        this.Latitudes = Latit
        this.Longitudes = Longit
    }
}
