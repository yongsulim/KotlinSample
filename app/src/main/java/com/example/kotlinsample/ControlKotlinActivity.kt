package com.example.kotlinsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.databinding.LayoutControlBinding

class ControlKotlinActivity : AppCompatActivity() {

    // ViewBinding 객체
    private lateinit var binding: LayoutControlBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ViewBinding 초기화
        binding = LayoutControlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 버튼 클릭 이벤트 처리
        binding.button.setOnClickListener {
            // numberField의 값을 읽어 int 형으로 변환
            val number = binding.numberField.text.toString().toInt()

            // when 문은 케이스로 조건식도 사용 가능
            when {
                number % 2 == 0 -> Toast.makeText(applicationContext, "${number} 는 2의 배수입니다", Toast.LENGTH_SHORT).show()
                number % 3 == 0 -> Toast.makeText(applicationContext, "${number} 는 3의 배수입니다", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext, "${number}", Toast.LENGTH_SHORT).show()
            }

            // 코틀린에서는 switch문을 대체해 when을 사용할 수 있다
            when (number) {
                // number가 1~4까지인 경우 실행
                in 1..4 -> binding.button.text = "실행 - 4"
                // number가 9, 18인 경우 실행
                9, 18 -> {
                    binding.button.text = "실행 - 9"
                }
                else -> binding.button.text = "실행"
            }
        }
    }
}
