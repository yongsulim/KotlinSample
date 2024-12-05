@file:JvmName("ToastUtil")
package com.example.kotlinsample

import android.widget.Toast

fun toastShort(message:String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show()
}

fun toastLong(message: String) {
    Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show()
}

// 코틀린에서는 함수의 기본값을 지정 가능하다
fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(MainApplication.getAppContext(), message, length).show()
}