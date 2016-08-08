package com.example.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
//import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //    private var textViewTitle: TextView? = null
    val firstName = "Kuljeet"
    val lastdName = "Singh"
    val timeOfStudent: String = ""
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title_text.text = "ksahdjkha"

//        textViewTitle = findViewById(R.id.title_text) as TextView

        title_text.setOnClickListener({ view -> conditionCheck() })
        myNumber()
        //dfdffd
        //sdjafklsd

    }

    fun conditionCheck() {
        when {
            title_text.text == "Dan" -> title_text.text = "kuljeet"
            title_text.text == "Dihiansan" -> title_text.text = "Singh"
            else -> title_text.text = fullName()
        }
    }

    fun fullName(): String {
        return "${firstName} ${lastdName}"
    }

    private fun myNumber() {

        Log.e("even number", numbers.filter { it % 2 == 0 }.toString())
        Log.e("even number", numbers.filter { it % 2 != 0 }.toString())
        Log.e("even number", numbers.filter { it > 2 }.toString())
    }
}
