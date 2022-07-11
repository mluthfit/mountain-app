package com.biliance.submission

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@SuppressLint("CustomSplashScreen")
@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    private val delaySplashScreen: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        hideActionBar()
        Handler().postDelayed({
            moveToMainPage()
            finish()
        }, delaySplashScreen)
    }

    private fun moveToMainPage() {
        val intent = Intent(this@SplashScreen, MainActivity::class.java)
        startActivity(intent)
    }

    private fun hideActionBar() {
        supportActionBar?.hide()
    }
}