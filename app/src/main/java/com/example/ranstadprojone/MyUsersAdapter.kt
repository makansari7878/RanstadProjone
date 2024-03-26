package com.example.ranstadprojone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyUsersAdapter(var userList : List<Users>) : RecyclerView.Adapter<MyUsersAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var name = itemView.findViewById<TextView>(R.id.textViewName)
        var username = itemView.findViewById<TextView>(R.id.textViewLMyUsername)

        fun myBindData(user : Users){
            name.text = user.name
            username.text = user.username // Corrected this line
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myView = LayoutInflater.from(parent.context).inflate(R.layout.item_layou_userst, parent, false)
        return MyViewHolder(myView)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myBindData(userList[position])
    }
}
