package com.example.testquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.testquiz.Constants.USER_NAME
import com.example.testquiz.utils.isValidNameValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

            if (isValidNameValue(etName.text.toString().trim())) {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this,
                    "Please enter valid name. Characters should between 4 to 9", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}