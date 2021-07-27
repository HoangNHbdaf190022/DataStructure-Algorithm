package com.company;

public class MyStack {
    int top;
    int maxSize;
    Node [] stack;

//  Constructor
    public MyStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
//      khởi tạo stack = mảng Node có maxSize
        this.stack = new Node[maxSize];
    }

//    check full
    boolean isFull() {
        return(top + 1 == maxSize);
    }
//    check empty
    boolean isEmpty() {
        return(top == -1);
    }
//    push
    public void push(Node node) {
        if(isFull()){
            System.out.println("Ngăn xếp đầy òi! \n");
        }else{
            top++; //top = top + 1;
            stack[top] = node;
        }
    }
//    pop
    public Node pop(){
        if (isEmpty()){
            System.out.print("Có chi mô mà pop!");
            return null;
        }else {
            Node node = stack[top];
            top--; //top = top - 1;
            return node;
        }
    }
//    peek
    public Node peek(Node node){
        if (isEmpty()){
            System.out.print("Có chi mô mà pop!");
            return null;
        }else{
            return stack[top];
        }
    }
//    print
    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].data);
        }
    }

}
