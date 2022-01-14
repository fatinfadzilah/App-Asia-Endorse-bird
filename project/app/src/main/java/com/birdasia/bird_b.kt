package com.birdasia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class bird_b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird_b)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Arborophylia"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val next2 = findViewById<ImageButton>(R.id.next)
        next2.setOnClickListener{
            val intent = Intent(this, bird_b_1::class.java)
            startActivity(intent)
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}