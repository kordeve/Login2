package com.emptymind.login2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin.setOnClickListener {

            var inputId = getId.text.toString()
            var inputPass = getPass.text.toString()

            if (inputId == "empol07" && inputPass == "qwer") {

                Log.d("메인화면 로그", "로그인 성공")
                //tag는 종류

                Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
            }
//            else if (inputId == "empol07" && inputPass != "qwer") {
//
//                Log.e("메인화면 로그", "패스워드 틀림")
//
//                Toast.makeText(this, "패스워드가 틀립니다", Toast.LENGTH_SHORT).show()
//
//            } else {
//                Log.e("메인화면 로그", "아이디&패스워드 틀림")
//
//                Toast.makeText(this, "아이디와 패스워드 모두 틀립니다", Toast.LENGTH_SHORT).show()
//
//
//            }

        }

    }

}

//clickBtn.setOnClickListener {
//    Log.d("메인화면 로그","클릭용 버튼 눌림")
//    Log.e("메인화면 로그","에러 관련 로그")
//    //tag는 종류
//
//    smallBtn.setOnClickListener {
//        Toast.makeText(this,"작은버튼 눌림",Toast.LENGTH_LONG).show()
//    }