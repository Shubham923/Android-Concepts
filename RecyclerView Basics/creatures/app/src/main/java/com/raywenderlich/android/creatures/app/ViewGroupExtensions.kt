package com.raywenderlich.android.creatures.app

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    var TAG = this.javaClass.simpleName
    Log.d(TAG, "View Group Inflater")
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}