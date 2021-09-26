package com.example.helloworldapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var input1=0f
    var input2=""
    var input3=0f
    lateinit var firstnumber:EditText
    lateinit var operation:EditText
    lateinit var secondnumber:EditText
    lateinit var tvresult:TextView
    lateinit var button: Button

    fun calculation(num1: Float, oper: String, num2: Float) : Float {
        try{
            var result=0f
            if (oper == "+") {
                result= num1 + num2
            } else if (oper == "-") {
                result= num1 - num2
            } else if (oper == "*") {
                result= num1 * num2
            } else if (oper == "/") {
                if (num2 == 0f) {
                    result=0f
                } else {
                    result= num1 / num2
                }

            }
            return result
        }catch (e: Exception){
            return 0f
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         firstnumber = findViewById(R.id.firstnumber)
        operation = findViewById(R.id.operation)
        secondnumber = findViewById(R.id.secondnumber)
        tvresult = findViewById(R.id.tvresult)
        button =findViewById(R.id.button)

        button.setOnClickListener(){
            input1=firstnumber.text.toString().toFloat()
            input2=operation.text.toString()
            input3=secondnumber.text.toString().toFloat()
            val res=calculation(input1,input2,input3)
            tvresult.text=res.toString()
        }


    }
}