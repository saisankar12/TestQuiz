package com.example.testquiz.screenTests

import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.testquiz.MainActivity
import com.example.testquiz.mainActivityScope
import com.example.testquiz.quizActivityScope
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityScreenTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    @LargeTest
    fun titleIsShown() {
        mainActivityScope {
            titleIsShown()
        }
    }

    @Test
    @LargeTest
    fun canEnterNameAndSeeNextScreen() {
        mainActivityScope {
            enterName("Robert")
            pressStart()
        }
        quizActivityScope {
            isOnQuestionsScreen()
        }
    }
}