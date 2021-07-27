package com.company;

public class Student {
    String IdStudent;
    String StudentName;

    public Student(String idStudent, String studentName) {
        IdStudent = idStudent;
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "Id: " +IdStudent+ ", Tên sinh viên: " +StudentName;

    }
}
