package com.example.hw_0418

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    val TAG ="hw"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val darbuotojas01 = Darbuotojas("Vardas01", "pavarde01", "39508210412")
        val darbuotojas02 = Darbuotojas("Vardas02", "pavarde01", "39508210412")
        val darbuotojas03 = Darbuotojas("Vardas03", "pavarde01", "39508210412")
        val darbuotojas04 = Darbuotojas("Vardas04", "pavarde01", "39508210412")


    }
}