package com.example.logisticsmanagmentsystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Main", this.toString())
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            val name: String = user_name.text.toString()
            val password: String = password.text.toString()
            intent.putExtra("login_name", name)
            intent.putExtra("password", password)
            startActivityForResult(intent, 1)
        }
        exit.setOnClickListener {
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                if(data?.getIntExtra("exit",-1) == -1)
                    finish()
            }
        }
    }
}
