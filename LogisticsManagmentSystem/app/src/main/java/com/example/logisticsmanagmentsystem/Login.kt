package com.example.logisticsmanagmentsystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.exit
import kotlin.system.exitProcess

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Login", this.toString())
        setContentView(R.layout.activity_login)
        your_name.text = "我是" + intent.getStringExtra("login_name")
        your_pw.text = "我的密码是" + intent.getStringExtra("password")
        exchange.setOnClickListener {
            val intent = Intent()
            intent.putExtra("exit", 1)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        exit.setOnClickListener {
            val intent = Intent()
            intent.putExtra("exit", -1)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent()
        intent.putExtra("eixt", 1)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
