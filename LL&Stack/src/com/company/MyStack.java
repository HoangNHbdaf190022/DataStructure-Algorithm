    package com.company;

    public class MyStack {
        Node head;

        public MyStack() {
            head = null;
        }

    //    check empty
        boolean isEmpty() {
            return(head == null);
        }

    //    push: lấy móc của node mới móc vào head
    //    cho head trỏ vào node mới
        public void push(Node node) {
            node.next = head;
            head = node;
        }

    //    kiểm tra rỗng hay không
    //    lấy node tạm giữ lấy head,
    //    cho head  trỏ vào node tiếp theo
        public void pop(){
            if (isEmpty()){
                System.out.print("Empty list!");
            }else{
                Node node = head;
                head = head.next;
            }
        }

        //    peek
        public Node peek(Node node){
            if (isEmpty()){
                System.out.print("Empty list!");
                return null;
            }else{
                return head;
            }
        }

        public void display(){
            Node currentNode = head;
            while(currentNode != null){
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }
