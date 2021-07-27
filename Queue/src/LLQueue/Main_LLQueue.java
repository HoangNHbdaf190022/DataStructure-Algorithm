package LLQueue;

import java.util.Scanner;

public class Main_LLQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số phần tử: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        for(int i = 0; i < n; i++){
//            System.out.print("Nhập phần tử thứ " +(i + 1)+ ": ");
//            arr[i] = sc.nextInt();
//        }

        My_LLQueue My_LLQueue = new My_LLQueue(5);
        My_LLQueue.enqueue(new Node(4));
        My_LLQueue.enqueue(new Node(3));
        My_LLQueue.enqueue(new Node(2));
        My_LLQueue.enqueue(new Node(1));
        My_LLQueue.enqueue(new Node(0));

        My_LLQueue.display();
        System.out.println();

        My_LLQueue.dequeue();
        My_LLQueue.display();

    }
}
