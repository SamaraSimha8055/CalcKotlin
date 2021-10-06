package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private var number1 : Float = 0.0f
    private var isPlus : Boolean = false
    private var isMinus : Boolean = false
    private var isDivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.number_edit_text)
    }

    fun operationFunction(view: View){

        when(view.id){

            R.id.btn_one ->{
                numberClicked(1)
            }

            R.id.btn_two ->{
                numberClicked(2)
            }

            R.id.btn_three ->{
                numberClicked(3)
            }

            R.id.btn_four ->{
                numberClicked(4)
            }

            R.id.btn_five ->{
                numberClicked(5)
            }

            R.id.btn_six ->{
                numberClicked(6)
            }

            R.id.btn_seven ->{
                numberClicked(7)
            }

            R.id.btn_eight ->{
                numberClicked(8)
            }

            R.id.btn_nine ->{
                numberClicked(9)
            }

            R.id.btn_zero ->{
                numberClicked(0)
            }

            R.id.btn_division ->{
                divisionClicked()
            }

            R.id.btn_minus ->{
                minusClicked()
            }

            R.id.btn_plus ->{
                plusClicked()
            }

            R.id.btn_dot ->{
                dotClicked()
            }

            R.id.btn_clear ->{
                editText.setText("")
            }

            R.id.btn_equal ->{
                equalClicked()

            }
        }
    }

    private fun numberClicked(numberClicked : Int){
        val number = editText.text.toString() + numberClicked.toString()
        editText.setText(number)
    }

    private fun dotClicked(){
        val number = editText.text.toString() + "."
        editText.setText(number)
    }

    private fun plusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus = true
    }

    private fun minusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus = true
    }

    private fun divisionClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivide = true
    }

    private fun equalClicked(){
        when {
            isPlus -> {
                plus()
            }
            isMinus -> {
                minus()
            }
            isDivide -> {
                divide()
            }
        }
    }

    private fun plus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 + number2
        editText.setText(result.toString())
        isPlus = false
    }

    private fun minus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 - number2
        editText.setText(result.toString())
        isMinus = false
    }

    private fun divide(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 / number2
        editText.setText(result.toString())
        isDivide = false
    }
}