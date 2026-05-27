package com.example.android_studio_test_exercice

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android_studio_test_exercice.MainActivity

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.android_studio_test_exercice", appContext.packageName)
    }

    @Test
    fun testActivityIsNotNull() {
        activityRule.scenario.onActivity { activity ->
            assertNotNull(activity)
        }
    }
}