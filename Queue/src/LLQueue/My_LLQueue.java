package LLQueue;

public class My_LLQueue {
    Node first;
    Node last;
    int size;

    public My_LLQueue(int size) {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

//    isEmpty
    boolean isEmpty() {
       return size == 0;
    }
//    enqueue
    void enqueue(Node node) {
        //Nếu rỗng cho first và last trỏ vào node mới
        if(isEmpty()){
            first = last = node;
        }else{
            //Lấy móc của last móc vào node mới
            // di chuyển last trỏ vào node mới
            //Tăng size lên 1
            last.next = node;
            last = node;
        }
        size ++;
    }

//    dequeue
     void dequeue() {
        if (isEmpty()){
            System.out.print("hoàng đợi rỗng!");
        }else{
            Node node = first;
            first = first.next;
            size--;
        }
    }

    public void display(){
        Node currentNode = first;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
