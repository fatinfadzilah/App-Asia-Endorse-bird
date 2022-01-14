package com.birdasia


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import kotlinx.android.synthetic.main.quiz_activity_main.*

class quiz_MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_activity_main)

        btnStart.setOnClickListener{
            if (TextUtils.isEmpty(txtName.text)){
                txtNameLayout.error="Name must not be empty"
            }else{
                val intent = Intent(this, quiz_questionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        txtName.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0!!.isEmpty()){
                    txtNameLayout.error="Name must not be empty"
                }else{
                    txtNameLayout.error=null
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

    }
}