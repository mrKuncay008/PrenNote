package com.example.prennote

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.prennote.fragments.HomeFragment

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                val gotohome = Intent(this@Splash, HomeFragment::class.java)
                startActivity(gotohome)
                finish()
            }
        }, 5000)
    }
}