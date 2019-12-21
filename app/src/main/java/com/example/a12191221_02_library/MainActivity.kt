package com.example.a12191221_02_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {



    }

    override fun setValues() {

        Glide.with(mContext).load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTSfMOs6lfIeOnK6hY4opBRyVa3LasUl_QpEOlcvlX4xDpcNhir").into(profileImgView)

    }


}
