package com.unguided.ugd3_15


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLogin: Button = findViewById(R.id.btnLogin)
        val btnRegister: Button = findViewById(R.id.btnRegister)



        btnRegister.setOnClickListener{
            val moveRegister = Intent(this, RegisterActivity::class.java)
            startActivity(moveRegister)
        }

        btnLogin.setOnClickListener{
            val moveLogin = Intent(this, LoginActivity::class.java)
            startActivity(moveLogin)
        }
    }

}