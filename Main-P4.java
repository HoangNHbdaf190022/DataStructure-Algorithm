package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack ms = new MyStack();
        MyQueue mq = new MyQueue();

        try {
        while (true){
            System.out.println("ENTER YOUR OPTIONS");
            System.out.println("1. ENTERING THE MESSAGE");
            System.out.println("2. SENDING THE MESSAGE");
            System.out.println("3. DISPLAYING THE MESSAGE");
            System.out.println("4. DELETE MESSAGE JUST ENTERED");
            System.out.println("5. EXIT");
            System.out.println("-----------------------------------------------------");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the message and type 'done' to exit:");
                    String mess = "";
                    while (!mess.equals("done")){
                        mess = sc.nextLine();
                        if(!mess.equals("done") && !mess.isEmpty() && mess.length() < 250){
                            mq.enqueue(new Node(mess));
                        }
                    }
                    break;
                case 2:
                    if (mq.isEmpty()){
                        System.out.println("No messages have been sent yet!\n");
                    }else{
                        while (!mq.isEmpty()){
                            ms.push(mq.dequeue());
                        }
                        System.out.println("Message has been sent!\n");
                    }
                    break;
                case 3:
                    System.out.println("The message received is :");
                    ms.display();
                    System.out.println();
                    break;
                case 4:
                    if (!ms.isEmpty()){
                        ms.pop();
                        System.out.println("A message has been removed!\n");
                    }else{
                        System.out.println("No messages!\n");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong key, please re-enter!\n");
                    break;
            }
        }
        }catch (Exception ex){
            System.out.println("Enter the wrong key!");
        }
    }
}
