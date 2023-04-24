package com.example.hw_0418

import java.time.LocalDate
import java.time.Period

class Darbuotojas (
    val vardas: String,
    val pavarde: String,
    val asmensKodas: String
) {
    //klasę Darbuotojas su savo kintamaisiais vardas, pavardė, asmens kodas (kaip tekstas), amžius, pareigos įmonėje, darbo patirtis (metais).
    var amzius = 0
        private set


    init {
        countAge()
    }

    fun countAge(): Int{   //birthDay: String
        val gimimoData = asmensKodas.substring(1,3).toInt()
        return  LocalDate.now().year - gimimoData
    }
}