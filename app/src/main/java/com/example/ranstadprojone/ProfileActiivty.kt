package com.example.ranstadprojone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class ProfileActiivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_actiivty)

        Log.i("mytag", "Profile Activity created")




        var countries = arrayOf("INDIA", "SRILANKA", "USA","ENGLAN", "FRANCE",
            "INDIA", "SRILANKA", "USA","ENGLAN", "FRANCE","INDIA", "SRILANKA", "USA","ENGLAN", "FRANCE")

        var resultTextView = findViewById<TextView>(R.id.textViewResultusername)
        var mylistview = findViewById<ListView>(R.id.listView)

       /*var result = intent.extras!!.getString("keyusername")
        resultTextView.text = result*/

       var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        mylistview.adapter = arrayAdapter

        resultTextView.setOnClickListener {
//            var myInt = Intent(this, MainActivity::class.java)
//            startActivity(myInt)
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("My Alert Dialog")
            alertDialog.setMessage("Do you want to continue ?")
            alertDialog.setCancelable(false)

            alertDialog.setPositiveButton("YES"){dialog,  which ->
                var rootview = findViewById<View>(android.R.id.content)
                var mySnackBar = Snackbar.make(rootview, "this is snackbar",Snackbar.LENGTH_LONG)
                mySnackBar.setAction("CLICK ME"){
                    Toast.makeText(this, "toast from snackbar", Toast.LENGTH_SHORT).show()
                }
                mySnackBar.show()


            }

            alertDialog.setNegativeButton("NO"){dialog,  which ->
                        this.finish()
            }

            alertDialog.show()
        }

    }


    override fun onStart() {
        super.onStart()
        Log.e("mytag", "Profile Activity started")

    }


    override fun onResume() {
        super.onResume()
        Log.d("mytag", "Profile Activity resume")

    }

    override fun onPause() {
        super.onPause()
        Log.e("mytag", "Profile Activity paused")

    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "Profile Activity stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "Profile Activity destryoed")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "Profile Activity restart")

    }
}