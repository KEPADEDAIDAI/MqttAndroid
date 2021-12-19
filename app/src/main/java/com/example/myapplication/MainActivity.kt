package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SentMqttTmp.init()
        val client:ClientMQTT = ClientMQTT()
        client.start()
        val flush: Button = findViewById(R.id.flush)
        val open: Button = findViewById(R.id.openTheDoor)
        val personNum: TextView = findViewById(R.id.personNum)
        val state: TextView = findViewById(R.id.state)
        val allTime : TextView = findViewById(R.id.allTime)
        val oneTime: TextView = findViewById(R.id.thisTime)
        flush.setOnClickListener {
            personNum.setText(Chang.nowNum)
            state.setText(Chang.state)
            allTime.setText(Chang.allTime)
            oneTime.setText(Chang.thisTime)
        }
    }
}