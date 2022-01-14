package com.birdasia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.quiz_activity_result.*

class quiz_resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_activity_result)

        val question=intent.getSerializableExtra("questions") as ArrayList<*>
        val answers=intent.getSerializableExtra("answers") as ArrayList<*>

        score.text="${answers.size}/${question.size}"

        btnRestart.setOnClickListener {
            startActivity(Intent(this, quiz_questionActivity::class.java))
            finish()
        }
    }
}