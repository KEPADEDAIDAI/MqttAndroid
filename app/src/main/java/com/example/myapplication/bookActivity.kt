package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class bookActivity : AppCompatActivity() {
    val array = arrayListOf<TextView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        val button2: Button = findViewById(R.id.button2) //同步按键
        init()
        show()
        button2.setOnClickListener {
//            Chang.sit[0] = ! Chang.sit[0]
            show()
        }
    }
    private fun init(){
        array.add(findViewById(R.id.textView3))
        array.add(findViewById(R.id.textView5))
        array.add(findViewById(R.id.textView7))
        array.add(findViewById(R.id.textView8))
        array.add(findViewById(R.id.textView9))
        array.add(findViewById(R.id.textView14))
        array.add(findViewById(R.id.textView11))
        array.add(findViewById(R.id.textView10))
        array.add(findViewById(R.id.textView13))
        array.add(findViewById(R.id.textView12))
    }
    @SuppressLint("SetTextI18n")
    fun show()
    {
        for(i in 0..9)
        {
            if(!Chang.sit[i]){
                array[i].setText("座位"+(i+1)+"：空")
            }
            else {
                array[i].setText("座位"+(i+1)+"：有人")
            }
        }
    }
}