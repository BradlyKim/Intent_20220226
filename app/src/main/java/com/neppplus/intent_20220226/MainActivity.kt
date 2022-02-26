package com.neppplus.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수 : 코드 초반부 첫번쨰 { 에 바로 만드는 변수
    val REQ_CODE_NICKNAME = 1000

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
        
        btnEditNickName.setOnClickListener { 
            
            val myIntent = Intent(this, EditNickNameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)   // 1000 : 닉네임을 변경하러 간다. 표식으로 사용

            
        }

    }
}