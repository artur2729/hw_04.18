package com.example.hw_0418

import android.util.Log

class Imone(
    val pavadiminas: String,
    val ikurimoMetai : String,
) {
    var sarasas = listOf<Darbuotojas>()
        get() = _sarasas
    private var _sarasas: MutableList<Darbuotojas> = mutableListOf()

    init{

    }

    fun funkcij1(darbuotojas: Darbuotojas, pareigosImoneje: String, darboPatirtis: Int){
        darbuotojas.pareigosImoneje = pareigosImoneje
        darbuotojas.darboPatirtis = darboPatirtis
        _sarasas.add(darbuotojas)
    }

    fun darbuotojuFiltras(TAG: String){
           _sarasas = _sarasas.sortedBy{it.darboPatirtis}.toMutableList()
        //Log.i(TAG, "darbuotojuFiltras: $sarasas")
    }

}