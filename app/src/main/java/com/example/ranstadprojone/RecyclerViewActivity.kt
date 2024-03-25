package com.example.ranstadprojone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var mySingerlist : ArrayList<SingersData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        mySingerlist = ArrayList<SingersData>()
        myRecyclerView.adapter = MyAdapter(mySingerlist)


        settiingData()

    }

    private fun settiingData() {

        var s1 = SingersData("Arjit Singh", "Hindi")
        mySingerlist.add(s1)
        var s2 = SingersData("Uddayvh", "Hindi")
        mySingerlist.add(s2)
        var s3 = SingersData("kumar sanu", "Hindi")
        mySingerlist.add(s3)
        var s4 = SingersData("debashis", "English")
        mySingerlist.add(s4)
        var s5 = SingersData("Arjit Singh", "Hindi")
        mySingerlist.add(s5)
        var s6 = SingersData("Arjit Singh", "Hindi")
        mySingerlist.add(s6)
        var s7 = SingersData("Arjit Singh", "Hindi")
        mySingerlist.add(s7)
    }
}