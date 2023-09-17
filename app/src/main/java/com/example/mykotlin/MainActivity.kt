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
     /*   val number1: Int=100
        val number2: Int=50
        var result:Int = number1+number2
        Log.i("console", result.toString());
            result = number1-number2
        Log.i("console",result.toString());
            result = number1*number1
        Log.i("console", result.toString())
            result = number1/number2
        Log.i("console",result.toString());*/
       /* var str = "Welcome To 'Android Programming' "
        Log.i("console",str)*/ /*var str = "Welcome to \\Android Programming\\"
        Log.i("console",str)*/
       /*   var str = "Welcome To \nAndroid programming"
        Log.i("console",str)*/
        var str = """Welcome To 
                     Android Programming""".trimMargin()
        Log.i("console",str)

    }
}
