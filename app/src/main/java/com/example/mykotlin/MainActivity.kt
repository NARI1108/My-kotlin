package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.logging.LogRecord
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var apple=3
        var orange=4
        var kind_first = apple+orange
        var kind_second = apple-orange
        var kind_third = apple*orange
        var kind_fourth = apple/orange
        Log.i("console",kind_first.toString())
        Log.i("console",kind_second.toString())
        Log.i("console",kind_third.toString())
        Log.i("console",kind_fourth.toString())
    }

}
