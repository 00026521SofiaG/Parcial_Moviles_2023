package com.example.riotracker_00026521.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.riotracker_00026521.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}