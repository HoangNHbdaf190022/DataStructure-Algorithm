package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isSuperPrime(n);
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void isSuperPrime(int n) {
        Queue<Integer> queue = new LinkedList<>();

        if (n <= 10) {
            for (int a = 2; a < n; a++) {
                if (isPrime(a)) {
                    queue.add(a);
                    System.out.print(queue.peek() + " ");
                    queue.remove();
                }
            }
        }
        else {
            for (int a = 2; a <= 9; a++) {
                if (isPrime(a)) {
                    queue.add(a);
                }
            }
            while (!queue.isEmpty()) {
                for (int a = 1; a <= 9; a++) {
                    int temp = (queue.peek() * 10) + a;
                    if (isPrime(temp) && temp < n) {
                        queue.add(temp);
                    }
                }
                System.out.print(queue.poll() + " ");
            }
        }
    }
}
