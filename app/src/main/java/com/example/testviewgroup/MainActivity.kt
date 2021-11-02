package com.example.testviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mLayout1: LinearLayout = findViewById(R.id.layout1)
        val mLayout2: LinearLayout = findViewById(R.id.layout2)
        val mLayout3: LinearLayout = findViewById(R.id.layout3)

        findViewById<Button>(R.id.button1).setOnClickListener{
                mLayout1.visibility = View.VISIBLE
                mLayout2.visibility = View.INVISIBLE
                mLayout3.visibility = View.INVISIBLE
            }

        findViewById<Button>(R.id.button2).setOnClickListener{
                mLayout1.visibility = View.INVISIBLE
                mLayout2.visibility = View.VISIBLE
                mLayout3.visibility = View.INVISIBLE
        }

        findViewById<Button>(R.id.button3).setOnClickListener{
                mLayout1.visibility = View.INVISIBLE
                mLayout2.visibility = View.INVISIBLE
                mLayout3.visibility = View.VISIBLE
        }

    }
}