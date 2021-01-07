package com.sopt.sampletoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var testToolbar : Toolbar
    private lateinit var testFragmentContainer : FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testToolbar = findViewById(R.id.test_toolbar)
        testFragmentContainer = findViewById(R.id.test_fragment_container)

        initToolbar(testToolbar)
    }

    private fun initToolbar(testToolbar: Toolbar) {
        testToolbar.title = "안녕"
        testToolbar.background = ContextCompat.getDrawable(this,R.color.purple_500)

    }
}