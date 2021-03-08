/*
 * Copyright (c) 2020. BoostTag E.I.R.L. Romell D.Z.
 * All rights reserved
 * porfile.romellfudi.com
 */

package com.romellfudi.ussd.main.view

import com.romellfudi.ussdlibrary.USSDApi

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2020-04-26
 */
interface MainFragmentMVPView {
    val ussdNumber: String
    var ussdApi: USSDApi
    val hasAllowOverlay: Boolean?
    fun showOverlay()
    fun showSplashOverlay()
    fun dismissOverlay()
    fun dialUp()
}
