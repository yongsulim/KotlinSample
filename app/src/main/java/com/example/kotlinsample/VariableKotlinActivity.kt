package com.example.kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.databinding.LayoutVariableBinding // ViewBinding 클래스 가져오기
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    // 클릭된 횟수를 저장할 변수
    var clickCount = 0

    // Activity가 시작된 시간
    val startTime = System.currentTimeMillis()

    private lateinit var binding: LayoutVariableBinding // ViewBinding 객체 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding 초기화 및 레이아웃 설정
        binding = LayoutVariableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 시작시간을 텍스트 형태로 변환
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)

        // 시작시간을 텍스트뷰에 보여줌
        binding.startTimeLabel.text = "Activity 시작시간: $timeText"

        // 클릭된 횟수 보여줌
        binding.clickCountLabel.text = "버튼이 클릭된 횟수: $clickCount"

        // 버튼에 이벤트 리스너 설정
        binding.button.setOnClickListener {
            // 클릭된 횟수 추가
            clickCount += 1
            // UI에 클릭횟수 다시 보여줌
            binding.clickCountLabel.text = "버튼이 클릭된 횟수: $clickCount"
        }
    }
}
