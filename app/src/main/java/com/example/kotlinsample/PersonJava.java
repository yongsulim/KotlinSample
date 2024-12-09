package com.example.kotlinsample;

public class PersonJava {
    // 나이
    private int age;

    // 이름, 이름은 변경할 수 없음
    private final String name;

    // 생성자에서 이름을 받는다
    public PersonJava(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
