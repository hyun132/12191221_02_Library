package com.example.a12191221_02_library

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {
    var mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}