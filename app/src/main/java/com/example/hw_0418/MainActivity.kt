package com.example.hw_0418

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    val TAG ="hw"

    lateinit var imone: Imone
    lateinit var darutojuListView: ListView
    lateinit var adapter: ArrayAdapter<Darbuotojas>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val darbuotojas01 = Darbuotojas("Vardas01", "pavarde01", "39505210412")
        val darbuotojas02 = Darbuotojas("Vardas02", "pavarde01", "39401210412")
        val darbuotojas03 = Darbuotojas("Vardas03", "pavarde01", "39107210412")
        val darbuotojas04 = Darbuotojas("Vardas04", "pavarde01", "38508290412")

        imone = Imone("Imone01", "2000-01-01")
        imone.funkcij1(darbuotojas01, "Manager", 10)
        imone.funkcij1(darbuotojas02, "Office clerk", 2)
        imone.funkcij1(darbuotojas03, "Programmer", 5)
        imone.funkcij1(darbuotojas04, "Tester", 3)

        Log.i(TAG, "doExercise: ${imone.sarasas}")

        setUpStudentListView()
    }

    private fun setUpStudentListView() {
        darutojuListView = findViewById(R.id.darbuotojuListView)
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_activated_1,
            imone.sarasas
        )
        darutojuListView.adapter = adapter

    }
}