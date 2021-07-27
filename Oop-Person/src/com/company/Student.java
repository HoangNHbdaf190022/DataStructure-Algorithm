package com.company;
public class Student extends Person{
    protected String StudentId;

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        StudentId = studentId;
    }

    @Override
    public String toString() {
       return "id: " +StudentId+ ", Tên: " +name+ ", Tuổi: " +age+ ", Địa chỉ: " +address;
    }
}
