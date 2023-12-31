package com.example.testquiz.screenTests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.testquiz.ResultActivity
import com.example.testquiz.resultActivityScope
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ResultScreenTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(ResultActivity::class.java)

    @Test
    @LargeTest
    fun titleIsShown() {
        resultActivityScope {
            isOnResultScreen()
        }
    }
}