package com.birdasia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class bird_d : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird_d)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Megalaima"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val next4 = findViewById<ImageButton>(R.id.next)
        next4.setOnClickListener{
            val intent = Intent(this, bird_d_1::class.java)
            startActivity(intent)
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}