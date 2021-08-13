package com.example.myapplication.ui.main.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val edtEmail: EditText = findViewById(R.id.edEmailLogin)
        val edtPass: EditText = findViewById(R.id.edPassword)
        val tvErrorLogin: TextView = findViewById(R.id.tvErrorLogin)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            addNickname(tvErrorLogin)
        }
    }

    private fun addNickname(tvErrorLogin: TextView) {
        tvErrorLogin.visibility = View.VISIBLE
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}