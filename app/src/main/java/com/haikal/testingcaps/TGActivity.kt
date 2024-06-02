package com.haikal.testingcaps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.haikal.testingcaps.databinding.ActivityTgBinding

class TGActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTgBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTgBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}