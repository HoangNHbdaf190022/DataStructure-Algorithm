package com.company;

public class Student {
    String id;
    String name;
    int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " +id+ ", Name: " +name+ ", Age: " + age;
    }
}
