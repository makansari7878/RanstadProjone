package com.example.ranstadprojone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var singerList: ArrayList<Users>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var singerName = itemView.findViewById<TextView>(R.id.textViewSinger)
        var lang = itemView.findViewById<TextView>(R.id.textViewLanguage)

        fun myBindData(singer : SingersData){
            singerName.text = singer.name
            lang.text = singer.language
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var myView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return  MyViewHolder(myView)
    }

    override fun getItemCount(): Int {
       return singerList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      // holder.myBindData(singerList[position])
    }
}