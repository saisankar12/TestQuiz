package com.example.testquiz

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class QuizNavigationTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun canNavigateAppToResults() {
        val name = "Rumit D. Patel"
        mainActivityScope {
            titleIsShown()
            enterName(name)
            pressStart()
        }
        quizActivityScope {
            isOnQuestionsScreen()
            answerAllCorrectly()
        }
        resultActivityScope {
            isOnResultScreen()
            nameIsShown(name)
            resultIsXOutOfTen(10)
            clickOnShareScore()
        }
    }
}