package com.example.testquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.testquiz.Constants.CORRECT_ANSWERS
import com.example.testquiz.Constants.TOTAL_QUESTIONS
import com.example.testquiz.Constants.USER_NAME
import com.example.testquiz.utils.shareText

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)
        val btnShareScore: Button = findViewById(R.id.btnShareScore)

        tvName.text = intent.getStringExtra(USER_NAME)
        val totalQuestions = intent.getIntExtra(TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(CORRECT_ANSWERS, 0)
        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnShareScore.setOnClickListener {
            shareText("I had an amazing quiz!")
        }
    }
}