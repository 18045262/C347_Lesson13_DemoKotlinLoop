package com.myapplicationdev.android.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..5){
            Log.d("MainActivity", "$i");
        }

        var i = 1;
        while (i<6){
            Log.d("MainActivity While loop", "$i");
            i++
        }
        button1.setOnClickListener {
            val word = editText.text.toString();
            var number = 0;
            for (i in word){
                number=+1;
                Log.d("MainActivity Count", "$number")
            }


        }

        button2.setOnClickListener {
            val word = editText.text.toString();
            for (i in word){
                Log.d("MainActivity Count", "$i")
            }
        }

    }
}
