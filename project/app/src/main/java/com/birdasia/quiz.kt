package com.birdasia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class quiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_mainmenu)

    val picture = findViewById<Button>(R.id.picture_quiz)
    picture.setOnClickListener{
        val intent = Intent(this, quiz_picture::class.java)
        startActivity(intent)
    }

    val sound = findViewById<Button>(R.id.sound_quiz)
    sound.setOnClickListener{
        val intent = Intent(this, quiz_sound::class.java)
        startActivity(intent)
    }

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Quiz"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }
    //handle onback pressed

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}

