package com.example.kotlinsample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class BmiJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        UI로 사용할 레이아웃 XML 파일을 지정한다.
        setContentView(R.layout.layout_view_binding);
    }
}