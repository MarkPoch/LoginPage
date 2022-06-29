package com.markpochodaj.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)

         val loginbtn = findViewById<MaterialButton>(R.id.loginbtn)

        //admin and admin
        loginbtn.setOnClickListener(View.OnClickListener {
            if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                //Correct
                Toast.makeText(this@MainActivity, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
            }else
                //incorrect
                Toast.makeText(this@MainActivity, "LOGIN FAILED!", Toast.LENGTH_SHORT).show()


        })
    }
}