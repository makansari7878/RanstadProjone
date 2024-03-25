package com.example.ranstadprojone

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {




    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Log.i("mytag", "Main Activity created")


        var submitButton = findViewById<Button>(R.id.buttonSubmit)
        var usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        var usernameTextView = findViewById<TextView>(R.id.textViewUsername)

        var mytoolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mytoolbar)




        submitButton.setOnClickListener {
         var username =   usernameEditText.text.toString()
            Log.i("mytag", "$username")
            Toast.makeText(this, "username is $username", Toast.LENGTH_LONG).show()
            usernameTextView.setText(username)

            var myIntent1 = Intent(this, ProfileActiivty::class.java)

            startActivity(myIntent1)

            // explicit intent
//            var myIntent = Intent(this, ProfileActiivty::class.java)
//            myIntent.putExtra("keyusername",username )
//            startActivity(myIntent)

           /* var myIntent = Intent("sagar")
            startActivity(myIntent)*/

           /* var myIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:949494949"))
            startActivity(myIntent)*/

           /* var myIntent = Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com"))
            startActivity(myIntent)*/

//            var myIntent = Intent(Intent.ACTION_VIEW)
//            myIntent.setClassName("com.android.calendar", "com.android.calendar.launchActivity")
//            startActivity(myIntent)

        }

    }

    override fun onStart() {
        super.onStart()
        Log.e("mytag", "Main Activity started")

    }


    override fun onResume() {
        super.onResume()
        Log.d("mytag", "Main Activity resume")

    }

    override fun onPause() {
        super.onPause()
        Log.e("mytag", "Main Activity paused")

    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag", "Main Activity stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag", "Main Activity destryoed")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag", "Main Activity restart")

    }
}