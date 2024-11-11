package com.example.kotlinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.databinding.LayoutViewBindingBinding // ViewBinding 클래스 가져오기


class BmiKotlinActivity : AppCompatActivity() {

    private lateinit var binding: LayoutViewBindingBinding // ViewBinding 객체 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        UI로 사용할 레이아웃 XML 파일을 지정한다.

        // ViewBinding 객체 초기화 및 레이아웃 설정
        binding = LayoutViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // bmi 버튼이 클릭된 경우 동작하는 코드를 작성한다.
        binding.bmiButton.setOnClickListener {
            // tallField 의 값을 읽어 온다
            val tall = binding.tallField.text.toString().toDoubleOrNull() ?: 0.0

            // weightField 의 값을 읽어 온다
            val weight = binding.weightField.text.toString().toDoubleOrNull() ?: 0.0

            // BMI를 계산, 체중 / 키 * 키 >> 키를 cm로 입력 받았으니 100으로 나눔
            // Math.pow()는 넘겨받은 파라미터 값을 제곱해 돌려줌
            // ex) Math.pow(2, 3)은 2의 3제곱 8을 돌려줌
            val bmi = weight / Math.pow(tall / 100, 2.0)

            // 결과 BMI를 resultLabel에 보여준다
            binding.resultLabel.text = "키: ${binding.tallField.text}, 체중: ${binding.weightField.text}, BMI: $bmi"
        }
    }
}