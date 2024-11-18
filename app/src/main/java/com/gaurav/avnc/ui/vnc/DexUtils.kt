package com.gaurav.avnc.ui.vnc

import android.app.Activity
import android.content.ComponentName
import android.util.Log
import java.lang.reflect.Method

object DexUtils {
    private var requestMetaKeyEventMethod: Method? = null
    private var manager: Any? = null

    init {
        try {
            val clazz = Class.forName("com.samsung.android.view.SemWindowManager")
            val obtain = clazz.getMethod("getInstance")
            requestMetaKeyEventMethod = clazz.getDeclaredMethod("requestMetaKeyEvent", ComponentName::class.java, java.lang.Boolean.TYPE)
            manager = obtain.invoke(null)
        } catch (e: Exception) {
            requestMetaKeyEventMethod = null
            manager = null
            Log.e("ELESBB_META", "Could not capture meta keys", e)
        }
    }

    fun CaptureMeta(activity: Activity, enable: Boolean) {
        try {
            requestMetaKeyEventMethod!!.invoke(manager, activity.componentName, enable)
        } catch (e: Exception) {
            Log.e("ELESBB_META", "Could not capture meta keys", e)
        }
    }
}
