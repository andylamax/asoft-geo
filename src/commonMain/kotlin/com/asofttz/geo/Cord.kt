package com.asofttz.geo

open class Cord {
    var lat = 0.0
    var lng = 0.0

    fun toArray() = arrayOf(lat, lng)

    companion object {
        val fake
            get() = Cord().apply {
                lat = (6740018..6873602).random().toDouble() / -1_000_000.0
                lng = (39168602..39348200).random().toDouble() / 1_000_000.0
            }
    }
}

val Collection<Cord>.average: Track
    get() = Track().apply {
        lat = 0.0
        lng = 0.0
        forEach {
            lat += it.lat
            lng += it.lng
        }
        lat /= size
        lng /= size
    }

val Array<Cord>.average: Track get() = toList().average