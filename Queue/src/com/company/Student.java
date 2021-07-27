package com.company;

public class Student {
    String Id;
    String Name;
    int Age;

    public Student(String id, String name, int age) {
        Id = id;
        Name = name;
        this.Age = age;
    }

    @Override
    public String toString() {
        return "ID: " +Id+ ", Tên: " +Name+ ", Tuổi: " +Age;
    }
}







