package com.example.riotracker_00026521.repository

import com.example.riotracker_00026521.data.model.RioModel

class RioRepository (private val rivers : MutableList<RioModel>){

    fun getRivers() = rivers

    fun addRivers(river: RioModel) =rivers.add(river)

}