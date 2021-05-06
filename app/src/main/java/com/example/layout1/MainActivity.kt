package com.example.layout1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonp = findViewById<Button>(R.id.button1)
        val buttonm = findViewById<Button>(R.id.button2)
        val buttont = findViewById<Button>(R.id.button3)
        val buttond = findViewById<Button>(R.id.button4)
        val buttonr = findViewById<Button>(R.id.button5)
        val buttons = findViewById<Button>(R.id.button6)
        val buttonload1 = findViewById<Button>(R.id.buttonc1)
        val buttonload2 = findViewById<Button>(R.id.buttonc2)
        val textview = findViewById<TextView>(R.id.textView)
        val textview1 = findViewById<TextView>(R.id.textView1)
        val bnum1 = findViewById<EditText>(R.id.editTextNumber)
        val bnum2 = findViewById<EditText>(R.id.editTextNumber2)
        buttonp.setOnClickListener{
            val num1 = bnum1.text.toString().toLong()
            val num2 = bnum2.text.toString().toLong()
            textview.text = getString(R.string.formula).format(num1,'+',num2)
            textview1.text = getString(R.string.answer).format(num1+num2)
        }
        buttonm.setOnClickListener{
            val num1 = bnum1.text.toString().toLong()
            val num2 = bnum2.text.toString().toLong()
            textview.text = getString(R.string.formula).format(num1,'-',num2)
            textview1.text = getString(R.string.answer).format(num1-num2)
        }
        buttont.setOnClickListener{
            val num1 = bnum1.text.toString().toLong()
            val num2 = bnum2.text.toString().toLong()
            textview.text = getString(R.string.formula).format(num1,'*',num2)
            textview1.text = getString(R.string.answer).format(num1*num2)
        }
        buttond.setOnClickListener{
            val num1 = bnum1.text.toString().toDouble()
            val num2 = bnum2.text.toString().toDouble()
            textview.text = getString(R.string.formula).format(num1,'/',num2)
            textview1.text = getString(R.string.answerdouble).format((num1/num2))
        }
        buttonr.setOnClickListener{
            val num1 = bnum1.text.toString().toDouble()
            val num2 = bnum2.text.toString().toDouble()
            textview.text = getString(R.string.formula).format(num1,'√',num2)
            textview1.text = getString(R.string.answerdouble).format((num1.pow(1/num2)))
        }
        buttons.setOnClickListener{
            val num1 = bnum1.text.toString().toDouble()
            val num2 = bnum2.text.toString().toDouble()
            textview.text = getString(R.string.formula).format(num1,'^',num2)
            textview1.text = getString(R.string.answerdouble).format((num1.pow(num2)))
        }
        buttonload1.setOnClickListener{
            val num1 = textview1.text.toString().trimStart('=',' ')
            bnum1.setText(num1, TextView.BufferType.EDITABLE)
        }
        buttonload2.setOnClickListener{
            val num1 = textview1.text.toString().trimStart('=',' ')
            bnum2.setText(num1, TextView.BufferType.EDITABLE)
        }
    }
}