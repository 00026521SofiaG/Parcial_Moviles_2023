package com.example.riotracker_00026521

import android.app.Application
import com.example.riotracker_00026521.data.rivers
import com.example.riotracker_00026521.repository.RioRepository

class RioReviewerApplication : Application() {
    val rioRepository : RioRepository by lazy {
        RioRepository(rivers )
    }

}