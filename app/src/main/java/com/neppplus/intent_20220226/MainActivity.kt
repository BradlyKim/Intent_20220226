package com.neppplus.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

//             OtherActivity 화면으로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        btnSendMessage.setOnClickListener {

//            입력된 문구를 변수로 담아두자

            val inputMessage = edtMessage.text.toString()

//            ViewMessageActivity 화면으로 이동 + 입력한 메게지를 첨부

            val myIntent = Intent(this, ViewMessageActivity::class.java)

//            myIntent, 데이터를 첨부하자
            myIntent.putExtra("메세지", inputMessage)

            startActivity(myIntent)


        }

    }
}