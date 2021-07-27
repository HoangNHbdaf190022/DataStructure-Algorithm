package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int soluong = sc.nextInt();
        MyStack ms = new MyStack(soluong);

        while (true){
            System.out.println();
            System.out.println("Nhập 1: Thêm Thông tin");
            System.out.println("Nhập 2: In Thông tin");
            System.out.println("Nhập 3: Out");
            System.out.println("************************");
            System.out.println("Nhập lựa chọn");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1: {
                    for (int i = 0; i < ms.maxSize; i++){
                        System.out.print("ID: ");
                        String Id = sc.nextLine();
                        System.out.print("Nhập tên: ");
                        String Name = sc.nextLine();
                        Student std = new Student(Id, Name);
                        ms.push(new Node(std));
                    }
                    break;
                }
                case 2:
                    ms.print();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
