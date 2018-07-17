package com.derrypradi.appgis

class ApiModel {

    var numid: Int = 0
    var name: String = ""
    var latitude: String = ""
    var longitude: String = ""

    constructor(numid: Int, name: String, latitude: String, longitude: String){
        this.numid  = numid
        this.name= name
        this.latitude   = latitude
        this.longitude    = longitude
    }
    constructor(name: String, latitude: String, longitude: String){
        this.name = name
        this.latitude   = latitude
        this.longitude    = longitude
    }

}