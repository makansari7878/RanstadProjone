package com.example.ranstadprojone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var myUserList: ArrayList<Users>
    lateinit var myAdapter: MyUsersAdapter // Changed to MyUsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        fetchData()
        myUserList = ArrayList()
        myAdapter = MyUsersAdapter(myUserList)

        val myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        myRecyclerView.adapter = myAdapter
    }

    private fun fetchData() {
        val makeCall = ApiCllient.retrofitBuilder.getData()

        makeCall.enqueue(object : Callback<List<Users>> {
            override fun onResponse(call: Call<List<Users>>?, response: Response<List<Users>>?) {
                val usersList: List<Users>? = response?.body()
                if (usersList != null) {
                    myUserList.clear() // Clear existing data
                    myUserList.addAll(usersList) // Add new data
                    myAdapter.notifyDataSetChanged() // Notify adapter about the changes
                }
            }

            override fun onFailure(call: Call<List<Users>>?, t: Throwable?) {
                Log.i("mytag", "Error is ${t.toString()}")
            }
        })
    }
}
