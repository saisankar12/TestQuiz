package com.example.testquiz.screenTests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.testquiz.QuizQuestionsActivity
import com.example.testquiz.quizActivityScope
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class QuizQuestionsScreenTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(QuizQuestionsActivity::class.java)

    @Test
    @LargeTest
    fun titleIsShown() {
        quizActivityScope {
            isOnQuestionsScreen()
        }
    }

    @Test
    @LargeTest
    fun canAnswerQuestion() {
        quizActivityScope {
            titleIsShown()
            selectAnswer(1)
            clickSubmit()
        }
    }
}