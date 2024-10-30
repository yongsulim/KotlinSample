package com.example.kotlinsample

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
import com.example.kotlinsample.ui.theme.KotlinSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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