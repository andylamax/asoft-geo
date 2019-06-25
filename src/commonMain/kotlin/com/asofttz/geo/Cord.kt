package com.asofttz.geo

import kotlinx.serialization.Serializable

@Serializable
open class Cord(var lat: Double = 0.0, var lng: Double = 0.0) {
    fun toArray() = arrayOf(lat, lng)

    override fun toString(): String = "Cord {lat: $lat, lng: $lng}"

    companion object {
        val fake
            get() = Cord().apply {
                lat = (6740018..6873602).random().toDouble() / -1_000_000.0
                lng = (39168602..39348200).random().toDouble() / 1_000_000.0
            }
    }
}

val Collection<out Cord>.average: Cord
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

val Array<out Cord>.average: Cord get() = toList().average