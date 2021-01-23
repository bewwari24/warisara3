package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val text2 = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val text3 = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        buttonAdd.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                Text00.setText("$count")
            }else{
                text1.show()
            }
        }
        buttonMinus.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                Text00.setText("$count")
            }else{
                text2.show()
            }
        }
        buttonReset.setOnClickListener(){
            count = 0
            Text00.setText("$count")
            text3.show()
        }
    }
}

