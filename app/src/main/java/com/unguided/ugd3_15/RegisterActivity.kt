package com.unguided.ugd3_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.view.get
import androidx.core.view.isEmpty
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {
    private lateinit var email: TextInputLayout
    private lateinit var noTelp: TextInputLayout
    private lateinit var tanggalLahir: TextInputLayout
    private lateinit var username: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        email = findViewById(R.id.inputEmail)
        noTelp = findViewById(R.id.inputNoTelp)
        tanggalLahir = findViewById(R.id.inputTanggalLahir)
        username = findViewById(R.id.inputUsername)
        password = findViewById(R.id.inputPassword)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            val mBundle = Bundle()
            val regUsername: String = username.getEditText()?.getText().toString()
            val regPassword: String = password.getEditText()?.getText().toString()
            val regEmail: String = email.getEditText()?.getText().toString()
            val regTanggalLahir: String = tanggalLahir.getEditText()?.getText().toString()
            val regNoTelp: String = noTelp.getEditText()?.getText().toString()


            if (regUsername.isEmpty()) {
                username.setError("Nama Tidak Boleh Kosong")
            }

            if (regPassword.isEmpty()) {
                password.setError("Password Tidak Boleh Kosong")
            }

            if (regNoTelp.isEmpty()) {
                noTelp.setError("Nomor Telepon Tidak Boleh Kosong")
            }

            if (regTanggalLahir.isEmpty()) {
                tanggalLahir.setError("Tanggal Lahir Tidak Boleh Kosong")
            }

            if (regEmail.isEmpty()) {
                email.setError("Email Tidak Boleh Kosong")
            }

            mBundle.putString("email", email.getEditText()?.getText().toString())
            mBundle.putString("noTelp", noTelp.getEditText()?.getText().toString())
            mBundle.putString("tanggalLahir", tanggalLahir.getEditText()?.getText().toString())
            mBundle.putString("username", username.getEditText()?.getText().toString())
            mBundle.putString("password", password.getEditText()?.getText().toString())

            intent.putExtras(mBundle)
            startActivity(intent)
        }
    }
}