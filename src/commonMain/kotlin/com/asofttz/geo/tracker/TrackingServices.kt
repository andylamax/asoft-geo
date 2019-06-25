package com.asofttz.geo.tracker

import com.asofttz.geo.Track

interface TrackingServices {
    var update_interval : Long
    var update_distance : Float
    fun setTrackListener(handler: (Track?) -> Unit)
    fun getLocation() : Track?
    fun dispatch()
    fun stop()
}