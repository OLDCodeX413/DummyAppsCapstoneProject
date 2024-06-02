package com.haikal.testingcaps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.haikal.testingcaps.databinding.ActivityQaBinding

class QAActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}