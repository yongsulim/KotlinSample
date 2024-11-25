package com.example.kotlinsample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.kotlinsample.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    // View Binding 객체 선언
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View Binding 객체 초기화
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // button1과 button2에 클릭 이벤트 설정
        binding.button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        binding.button3.setOnClickListener {
            // Intent 로 VariableJavaActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }
        binding.button4.setOnClickListener {
            // Intent 로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }
        binding.button5.setOnClickListener {
            // Intent 로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, ControlJavaActivity::class.java))
        }
        binding.button6.setOnClickListener {
            // Intent 로 VariableKotlinActivity를 타겟으로 지정하고 startActivity로 실행
            startActivity(Intent(this@MainActivity, ControlKotlinActivity::class.java))
        }
    }
}