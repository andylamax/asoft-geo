package com.asofttz.geo

import com.asofttz.date.Date
import com.asofttz.date.DateFactory
import com.asofttz.date.DateSerializer
import kotlinx.serialization.Serializable

open class Track() {

    open var lat: Double = 0.0
    open var lng: Double = 0.0

    @Serializable(with = DateSerializer::class)
    open var timestamp: Date = DateFactory.today()

    constructor(cord: Cord) : this() {
        lat = cord.lat
        lng = cord.lng
    }

    fun toArray() = arrayOf(lat, lng)

    override fun toString(): String = "Cord {lat: $lat, lng: $lng}"

    companion object {
        val fake
            get() = Track().apply {
                lat = (6740018..6873602).random().toDouble() / -1_000_000.0
                lng = (39168602..39348200).random().toDouble() / 1_000_000.0
            }
    }
}

val Collection<out Track>.average: Cord
    get() = Cord().apply {
        lat = 0.0
        lng = 0.0
        forEach {
            lat += it.lat
            lng += it.lng
        }
        lat /= size
        lng /= size
    }

val Array<out Track>.average: Cord get() = toList().average