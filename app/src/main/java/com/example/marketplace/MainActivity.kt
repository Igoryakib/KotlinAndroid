package com.example.marketplace

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name_field = findViewById<EditText>(R.id.editTextTextPersonName7)
        val email_field = findViewById<EditText>(R.id.editTextTextPersonName8)
        val password_field = findViewById<EditText>(R.id.editTextTextPersonName9)
        val phone_field = findViewById<EditText>(R.id.editTextTextPersonName2)
        val register_button = findViewById<Button>(R.id.button)
        register_button.setOnClickListener {
            if(name_field.getText().toString().trim() == "" || email_field.getText().toString().trim() == "" || password_field.getText().toString().trim() == "" || phone_field.getText().toString().trim() == "") {
                Toast.makeText(applicationContext, R.string.field_unFill, Toast.LENGTH_LONG).show()
            } else {
                println("userRegistered")
            }
        }
    }
    fun goLoginScreen (view: View) {
        setContentView(R.layout.login_screen)
        val email_login = findViewById<EditText>(R.id.editTextTextPersonName13)
        val password_login = findViewById<EditText>(R.id.editTextTextPersonName14)
        val login_button = findViewById<Button>(R.id.button5)
        login_button.setOnClickListener {
            if(email_login.getText().toString().trim() == "" || password_login.getText().toString().trim() == "") {
                Toast.makeText(applicationContext, R.string.field_unFill, Toast.LENGTH_LONG).show()
            } else {
                println("authorized")
            }
        }
    }
    fun goRegisterScreen (view: View) {
        setContentView(R.layout.activity_main)
    }
}