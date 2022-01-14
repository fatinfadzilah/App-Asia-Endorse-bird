package com.birdasia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView;

class birdid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birdsid_one)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Birds Species"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


        val a = findViewById<ImageButton>(R.id.img_a)
        a.setOnClickListener{
            val intent = Intent(this, bird_a::class.java)
            startActivity(intent)
        }

        val b = findViewById<ImageButton>(R.id.img_b)
        b.setOnClickListener{
            val intent = Intent(this, bird_a::class.java)
            startActivity(intent)
        }

        val c = findViewById<ImageButton>(R.id.img_c)
        c.setOnClickListener{
            val intent = Intent(this, bird_a::class.java)
            startActivity(intent)
        }

        val d = findViewById<ImageButton>(R.id.img_d)
        d.setOnClickListener{
            val intent = Intent(this, bird_a::class.java)
            startActivity(intent)
        }

        val e = findViewById<ImageButton>(R.id.img_e)
        e.setOnClickListener{
            val intent = Intent(this, bird_a::class.java)
            startActivity(intent)
        }
        val f = findViewById<ImageButton>(R.id.img_f)
        f.setOnClickListener{
            val intent = Intent(this, bird_a::class.java)
            startActivity(intent)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}