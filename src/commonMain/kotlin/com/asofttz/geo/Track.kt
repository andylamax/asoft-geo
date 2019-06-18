package com.asofttz.geo

import com.asofttz.date.Date
import com.asofttz.date.DateFactory

open class Track(lat: Double = 0.0, lng: Double = 0.0, var timestamp: Date = DateFactory.today()) : Cord(lat, lng) {
    constructor(cord: Cord) : this(cord.lat, cord.lng)

    companion object {
        val fake get() = Track(Cord.fake)
    }
}