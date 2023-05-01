package com.example.hw_0418

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class Darbuotojas (
    val vardas: String,
    val pavarde: String,
    val asmensKodas: String
) {
    //klasę Darbuotojas su savo kintamaisiais vardas, pavardė, asmens kodas (kaip tekstas), amžius, pareigos įmonėje, darbo patirtis (metais).
    var amzius = 0
        private set
    var pareigosImoneje : String = ""
    var darboPatirtis = 0


    init {
        countAge()
    }

    fun countAge(): Int{   //birthDay: String
        val gimimoData = asmensKodas.substring(1,7)
        var formatter = DateTimeFormatter.ofPattern("yyMMdd")
        var date = LocalDate.parse(gimimoData, formatter)
        var metai = Period.between(date, LocalDate.now()).years
        if(metai < 0) metai = metai + 100
        return metai
    }

    override fun toString(): String {
        return "Darbuotojas(%s %s, pareigos: %s, darbo patirtis: %s)".format(
            this.vardas,
            this.pavarde,
            this.pareigosImoneje,
            this.darboPatirtis
        )
    }
}