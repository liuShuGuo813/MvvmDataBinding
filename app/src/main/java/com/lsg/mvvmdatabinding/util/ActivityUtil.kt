package com.lsg.mvvmdatabinding.util

import android.content.Context
import android.content.Intent

/**
 *  Created by lsg on 2020/10/15
 */
object ActivityUtil {

    @JvmStatic
    fun transfer(context: Context,clazz: Class<*>?){
        val intent = Intent(context,clazz)
        context.startActivity(intent)
    }

}