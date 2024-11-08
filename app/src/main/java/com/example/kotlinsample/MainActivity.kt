package com.example.kotlinsample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.kotlinsample.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View Binding 초기화
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // button1과 button2에 클릭 이벤트 설정
        binding.button1.setOnClickListener {
            startActivity(Intent(this, BmiJavaActivity::class.java))
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(this, BmiKotlinActivity::class.java))
        }
    }
}


