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
        var str = "welcome to android programming"
        var str1 = str.subSequence(11,18);
        Log.i("console",str1.toString());
        var str2 = str.length;
        Log.i("console", str2.toString());
        var str3 = str.contains("android",true);
        Log.i("console",str3.toString());
        var firstName = "Naser";
        var lastName = "Ahmadi"
        var str4 = "this is my name "+firstName+" "+lastName;
        var str5 = "this is my name $firstName $lastName";
        Log.i("console", str4);
        Log.i("console",str5);
    }

}
