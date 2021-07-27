//package com.company;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập số lượng: ");
//        int n = sc.nextInt();
//        Student []arr = new Student[n];
//
//        MyStack ms = new MyStack();
//        sc.nextLine();
//
//        for(int i = 0; i < n; i++){
//            System.out.print("Nhập id: ");
//            String id = sc.nextLine();
//            System.out.print("Nhập tên: ");
//            String name = sc.nextLine();
//            System.out.print("Nhập tuổi: ");
//            int age = sc.nextInt();
//            sc.nextLine();
//
//            Student students = new Student(id, name, age);
//            arr[i]=students;
//
//        }
//
//        ms.display();
//
//    }
//}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack ms = new MyStack();

        while (true){
            System.out.println();
            System.out.println("Option 1: Insert");
            System.out.println("Option 2: Display");
            System.out.println("Option 3: Remove an element");
            System.out.println("Option 4: Exit!");
            System.out.println("************************");
            System.out.println("***Select Option***");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1: {
                        System.out.print("Enter ID: ");
                        String Id = sc.nextLine();
                        System.out.print("Enter name: ");
                        String Name = sc.nextLine();
                        System.out.print("Enter age: ");
                        int Age = sc.nextInt();
                        sc.nextLine();

                        Student std = new Student(Id, Name, Age);
                        ms.push(new Node(std));
                    break;
                }
                case 2:
                    ms.display();
                    break;
                case 3:
                    ms.pop();
                    System.out.println("An element has been removed!");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}












