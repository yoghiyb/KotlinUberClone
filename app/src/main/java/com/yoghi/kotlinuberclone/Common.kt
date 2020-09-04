package com.yoghi.kotlinuberclone

import com.yoghi.kotlinuberclone.model.DriverInfoModel

object Common {
    fun buildWelcomeMessage(): String {
        return StringBuilder("Welcome, ")
            .append(currentUser!!.firstName)
            .append(" ")
            .append(currentUser!!.lastName)
            .toString()
    }

    val DRIVER_LOCATION_REFERENCE: String = "DriverLocation"
    var currentUser: DriverInfoModel? = null
    val DRIVER_INFO_REFERENCE: String = "DriverInfo"
}