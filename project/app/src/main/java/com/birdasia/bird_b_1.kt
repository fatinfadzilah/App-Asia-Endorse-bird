package com.birdasia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class bird_b_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird_b_1)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Arborophylia"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}