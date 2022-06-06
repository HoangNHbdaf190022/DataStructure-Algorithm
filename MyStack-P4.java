package com.company;

public class MyStack {

 Node top;

    public MyStack(){
        this.top = null;
    }
    boolean isEmpty(){
        return top == null;
    }
    void push(Node node){
        node.next = top;
        top = node;
    }
    Node pop(){
        Node x = top;
        try{
            top = top.next;
        }catch (Exception e){
            System.out.println("Empty stack!");
        }
        return x;
    }
    void display(){
        Node current = top;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}



