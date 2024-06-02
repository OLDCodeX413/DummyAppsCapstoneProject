package com.haikal.testingcaps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatHistoryAdapter(private val chatHistoryList: List<ChatHistoryItem>) :
    RecyclerView.Adapter<ChatHistoryAdapter.ChatHistoryViewHolder>() {

    class ChatHistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val chatHistoryText: TextView = itemView.findViewById(R.id.chatHistoryText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHistoryViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.chat_history_item, parent, false)
        return ChatHistoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatHistoryViewHolder, position: Int) {
        val currentItem = chatHistoryList[position]
        holder.chatHistoryText.text = currentItem.text
    }

    override fun getItemCount() = chatHistoryList.size
}