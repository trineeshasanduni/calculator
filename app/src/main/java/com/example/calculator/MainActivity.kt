package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultdisplay = findViewById<TextView>(R.id.input)

        val num1 = findViewById<Button>(R.id.button_1)
        val num2 = findViewById<Button>(R.id.button_2)
        val num3 = findViewById<Button>(R.id.button_3)
        val num4 = findViewById<Button>(R.id.button_4)
        val num5 = findViewById<Button>(R.id.button_5)
        val num6 = findViewById<Button>(R.id.button_6)
        val num7 = findViewById<Button>(R.id.button_7)
        val num8 = findViewById<Button>(R.id.button_8)
        val num9 = findViewById<Button>(R.id.button_9)
        val num0 = findViewById<Button>(R.id.button_0)
        val add = findViewById<Button>(R.id.button_add)
        val multiply = findViewById<Button>(R.id.button_mul)
        val divide = findViewById<Button>(R.id.button_div)
        val subtract = findViewById<Button>(R.id.button_sub)
        val equal = findViewById<Button>(R.id.button_equal)
        val clear = findViewById<Button>(R.id.button_clear)
        val ac = findViewById<Button>(R.id.button_allclear)

        var firstval = "0"
        var operatorval = " "


        clear.setOnClickListener {
            resultdisplay.text = "0"
        }
        ac.setOnClickListener {
            resultdisplay.text = "0"
            firstval = "0"
            operatorval = " "
        }

        num1.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="1"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="1"
            }
            else{
                resultdisplay.text ="${currentval}1"
            }
        }
        num2.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="2"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="2"
            }
            else{
                resultdisplay.text ="${currentval}2"
            }
        }
        num3.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="3"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="3"
            }
            else{
                resultdisplay.text ="${currentval}3"
            }
        }
        num4.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="4"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="4"
            }
            else{
                resultdisplay.text ="${currentval}4"
            }
        }
        num5.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="5"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="5"
            }
            else{
                resultdisplay.text ="${currentval}5"
            }
        }
        num6.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="6"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="6"
            }
            else{
                resultdisplay.text ="${currentval}6"
            }
        }
        num7.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="7"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="7"
            }
            else{
                resultdisplay.text ="${currentval}7"
            }
        }
        num8.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="8"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="8"
            }
            else{
                resultdisplay.text ="${currentval}8"
            }
        }
        num9.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="9"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="9"
            }
            else{
                resultdisplay.text ="${currentval}9"
            }
        }
        num0.setOnClickListener {
            var currentval = resultdisplay.text
            if(currentval == "0"){
                resultdisplay.text="0"
            }
            else if (currentval == "+" || currentval == "-" || currentval == "*" || currentval == "/" ){
                resultdisplay.text="0"
            }
            else{
                resultdisplay.text ="${currentval}0"
            }
        }

        add.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "+"
            operatorval = "+"
        }
        subtract.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "-"
            operatorval = "-"
        }
        divide.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "/"
            operatorval = "/"
        }
        multiply.setOnClickListener {
            var currentval = resultdisplay.text;
            firstval = currentval.toString()
            resultdisplay.text = "*"
            operatorval = "*"
        }


        equal.setOnClickListener {
            var currentval = resultdisplay.text;
            var secnval = currentval.toString();
            var result=0
            if(operatorval == "+"){
                resultdisplay.text = (firstval.toInt() + secnval.toInt()).toString();
            }
            if(operatorval == "-"){
                resultdisplay.text = (firstval.toInt() - secnval.toInt()).toString();
            }
            if(operatorval == "*"){
                resultdisplay.text = (firstval.toInt() * secnval.toInt()).toString();
            }
            if(operatorval == "/"){
               try{
                   val calculateans = firstval.toInt() / secnval.toInt()
                   resultdisplay.text = calculateans.toString()
               }catch(e:ArithmeticException){
                     resultdisplay.text = "undefined"
               }
           }

}

    }
}