package com.asofttz.geo

import com.asofttz.date.DateFactory

open class Track : Cord() {
    var timestamp = DateFactory.today()
}