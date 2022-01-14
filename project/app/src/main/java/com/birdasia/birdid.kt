package com.birdasia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class birdid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birdsid_one)

    val actionbar = supportActionBar
    //set actionbar title
    actionbar!!.title = "Birds Identity"
    //set back button
    actionbar.setDisplayHomeAsUpEnabled(true)
    actionbar.setDisplayHomeAsUpEnabled(true)
}
    //handle onback pressed
    override fun onSupportNavigateUp(): Boolean {
//    onBackPressed()
    return true
}

}