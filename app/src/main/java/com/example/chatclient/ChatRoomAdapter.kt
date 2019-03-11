package com.example.chatclient

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ChatRoomAdapter(list: List<Message>) : RecyclerView.Adapter<ChatRoomAdapter.MyViewHolder>() {
    var messageList : List<Message> = list

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nickname : TextView
        var message : TextView

        init {
            nickname = view.findViewById(R.id.nickname)
            message = view.findViewById(R.id.message)
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.new_message, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val message = messageList.get(position)
        holder.nickname.text = message.nickname
        holder.message.text = message.message
    }
}