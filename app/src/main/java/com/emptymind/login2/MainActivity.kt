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
            //버튼 클릭 이벤트 전에 이 코드를 쓰면 변수에 값이 입력이 안된다.

            if (inputId == "admin@test.com" && inputPass == "qwer") {

                Log.d("메인화면 로그", "로그인 성공")
                //tag는 종류

                var name = "신훈일"

                Toast.makeText(this, "${name}님 환영합니다", Toast.LENGTH_SHORT).show()
            }
            else {

                Log.e("메인화면 로그", "패스워드 틀림")

                Toast.makeText(this, "아이디나 패스워드가 틀립니다", Toast.LENGTH_SHORT).show()

            }

        }

    }

}

