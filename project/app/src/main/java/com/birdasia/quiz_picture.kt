package com.birdasia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class quiz_picture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_picture)

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