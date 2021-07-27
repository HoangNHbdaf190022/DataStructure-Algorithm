package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước hàng đợi: ");
        int soluong = sc.nextInt();
        MyQueue mq = new MyQueue(soluong);

        while (true){
            System.out.println();
            System.out.println("Nhập 1: Thêm Thông tin");
            System.out.println("Nhập 2: In Thông tin");
            System.out.println("Nhập 3: Xóa Thông tin");
            System.out.println("Nhập 4: Thoát");
            System.out.println("************************");
            System.out.println("***Nhập lựa chọn***");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1: {
                    System.out.print("ID: ");
                    String Id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String Name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int Age = sc.nextInt();
                    sc.nextLine();

                    Student std = new Student(Id, Name, Age);
                    mq.enqueue(new Node(std));
                    break;
                }
                case 2:
                    mq.display();
                    break;
                case 3:
                    mq.dequeue();
                    System.out.println("Một hàng đợi vừa được xóa!");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}