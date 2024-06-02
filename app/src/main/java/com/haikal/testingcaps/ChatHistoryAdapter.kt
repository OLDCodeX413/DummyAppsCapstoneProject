package com.haikal.testingcaps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.haikal.testingcaps.databinding.ChatHistoryItemBinding

class ChatHistoryAdapter(private val chatHistoryList: List<ChatHistoryItem>) :
    RecyclerView.Adapter<ChatHistoryAdapter.ChatHistoryViewHolder>() {

    class ChatHistoryViewHolder(val binding: ChatHistoryItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHistoryViewHolder {
        val binding = ChatHistoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatHistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatHistoryViewHolder, position: Int) {
        val currentItem = chatHistoryList[position]
        holder.binding.chatHistoryText.text = currentItem.text
    }

    override fun getItemCount() = chatHistoryList.size
}