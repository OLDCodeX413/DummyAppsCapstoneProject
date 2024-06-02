package com.haikal.testingcaps

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

class MainActivity : AppCompatActivity() {

    private lateinit var chatHistoryRecyclerView: RecyclerView
    private lateinit var chatHistoryAdapter: ChatHistoryAdapter
    private lateinit var chatHistoryList: List<ChatHistoryItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chatHistoryRecyclerView = findViewById(R.id.chatHistoryRecyclerView)

        chatHistoryList = generateDummyChatHistory() // Replace with your data source
        chatHistoryAdapter = ChatHistoryAdapter(chatHistoryList)

        chatHistoryRecyclerView.adapter = chatHistoryAdapter
        chatHistoryRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun generateDummyChatHistory(): List<ChatHistoryItem> {
        val itemList = mutableListOf<ChatHistoryItem>()
        for (i in 1..5) {
            itemList.add(ChatHistoryItem("Make me a question from the document\n\nQuestion:\nGive two examples of abstract nouns.\n\nAnswer:\nLove, happiness."))
        }
        return itemList
    }
}