package com.haikal.testingcaps

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.haikal.testingcaps.databinding.ActivityOcrBinding

class OCRActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOcrBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOcrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnDelete.setOnClickListener {
            Toast.makeText(this, "Delete button clicked", Toast.LENGTH_SHORT).show()
        }

        binding.selectFromDeviceButton.setOnClickListener {
            Toast.makeText(this, "Select from device button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}