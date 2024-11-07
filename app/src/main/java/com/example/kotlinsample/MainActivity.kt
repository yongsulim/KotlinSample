package com.example.kotlinsample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinsample.databinding.ActivityMainBinding
import com.example.kotlinsample.ui.theme.KotlinSampleTheme

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

        enableEdgeToEdge()
        setContent {
            KotlinSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // 클릭된 횟수를 저장할 상태 변수
    val clickCount = remember { mutableStateOf(0) }

    Text(
        text = "Hello $name!",
        modifier = modifier
    )

    Button(
        onClick = {
            clickCount.value += 1 // 버튼 클릭 시 클릭 횟수 증가
        }
    ) {
        Text(text = "Click Me") // 버튼 텍스트
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinSampleTheme {
        Greeting("Android")
    }
}
