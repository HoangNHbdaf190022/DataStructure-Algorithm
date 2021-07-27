package com.company;

public class MyQueue {
    int first;
    int last;
    int size;
    int maxSize;
    Node [] queue;

// Constructor
    public MyQueue(int maxSize) {
        first = last = 0;
        this.size = 0;
        this.maxSize = maxSize;
        this.queue = new Node[maxSize];
    }
// isEmpty
    boolean isEmpty() {
        return size == 0;
    }

// isFull
//    boolean isFull() { return size == (maxSize - 1); }
    boolean isFull() {
        return size == maxSize;
    }

// enqueue
    public void enqueue(Node node){
        if(isFull()){
            System.out.print("\nHàng đợi đã đầy!\n");
        }else{
            queue[last] = node;
            last++;
            size++;
        }
    }
// dequeue
    public void dequeue(){
        if(isEmpty()){
            System.out.print("Hàng đợi rỗng rồi! ");
        }else{
           queue[first] = null;
           first++;
           size--;
        }
    }

    public void display(){
        for(int i = first; i < maxSize; i ++){
                System.out.println(queue[i].data);
        }
    }

}

