package com.example.riotracker_00026521.ui.rio

import android.text.Spannable.Factory
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.riotracker_00026521.RioReviewerApplication
import com.example.riotracker_00026521.data.model.RioModel
import com.example.riotracker_00026521.repository.RioRepository

class RioViewModel(private val repository: RioRepository) : ViewModel() {
    var name = MutableLiveData("")
    var length = MutableLiveData("")
    var status = MutableLiveData("")

    fun setSelectedRivers(river: RioModel) {
        name.value = river.name
        length.value = river.lenght
    }

    fun getRivers() = repository.getRivers()
    fun addRivers(river: RioModel) = repository.addRivers(river)


    fun createRiver() {
        if(!validateData()){
            status.value = WRONG_INFORMATION
            return
        }

        val river = RioModel(
            name.value!!,
            length.value!!
        )

        addRivers(river)
        clearData()

        status.value = RIVER_CREATED

    }

    fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            length.value.isNullOrEmpty() -> return false
        }
        return true
    }

    fun clearData() {
        name.value = ""
        length.value = ""
    }


    fun clearStatus(){
    status.value =  INACTIVE

    }


    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as RioReviewerApplication
                RioViewModel(app.rioRepository)
            }
        }

        const val RIVER_CREATED = "River created"
        const val WRONG_INFORMATION = "Wrong Information"
        const val INACTIVE = ""
    }
}