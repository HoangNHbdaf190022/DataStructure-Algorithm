package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        Student [] students = new Student[n];

        for (int i = 0; i < n; i++){
            System.out.print("Id: ");
            String id = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Address: ");
            String add = sc.next();

            Student std = new Student(name, age, add, id);
            students[i] = std;
        }
        for (Student xyz : students){
            System.out.println(xyz);
        }

    }
}
