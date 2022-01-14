package com.birdasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)

        val btnbirds_id = findViewById<Button>(R.id.birds_id)
        btnbirds_id.setOnClickListener{
            val intent = Intent(this, birdid::class.java)
            startActivity(intent)
        }

        val btnquiz = findViewById<Button>(R.id.Quiz)
        btnquiz.setOnClickListener{
            val intent = Intent(this, quiz_questionActivity::class.java)
            startActivity(intent)
        }

    }
    private var doubleBackToExitPressedOnce = false
    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Please click BACK to exit", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
    }

    }
