package com.haikal.testingcaps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.haikal.testingcaps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val chatHistoryAdapter: ChatHistoryAdapter by lazy {
        ChatHistoryAdapter(generateDummyChatHistory())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding.chatHistoryRecyclerView) {
            adapter = chatHistoryAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        binding.ocrButton.setOnClickListener {
            startActivity(Intent(this, OCRActivity::class.java))
        }

        binding.qaButton.setOnClickListener {
            startActivity(Intent(this, QAActivity::class.java))
        }

        binding.tsButton.setOnClickListener {
            startActivity(Intent(this, TSActivity::class.java))
        }

        binding.tgButton.setOnClickListener {
            startActivity(Intent(this, TGActivity::class.java))
        }
    }

    private fun generateDummyChatHistory(): List<ChatHistoryItem> {
        return List(5) {
            ChatHistoryItem("Make me a question from the document\n\nQuestion:\nGive two examples of abstract nouns.\n\nAnswer:\nLove, happiness.")
        }
    }
}