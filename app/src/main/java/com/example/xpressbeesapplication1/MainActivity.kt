package com.example.xpressbeesapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Before_Development.setOnClickListener {
            val page2Intent = Intent ( this, Page2::class.java)
            startActivity(page2Intent)
        }
    btn_During_Development2.setOnClickListener {
        val Intentdurringdevelopment = Intent (this, During_development::class.java)
        startActivity(Intentdurringdevelopment)
    }

    }
}
