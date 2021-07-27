public class MyList {
    Node head;
    Node tail;

    public MyList() {}
    //    change head & tail = null
    public MyList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }
//    check link null or not
    boolean isEmpty(){
        return (this.head == null);
    }

//    add a value to the end of the list
    public void add(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
//    add at any position
    public void addPo(Node n, int Po){
        Node crNode = head;
        Node nextNode = null;

        int i = 0;
        while (i < Po){
            i++;
            nextNode = crNode;
            crNode = crNode.next;
        }
        n.next = crNode;
        nextNode.next = n;
    }
//    add many values in arrays
    public void addmany(int [] arr){
        for ( int i: arr) {
            add(i);
        }
    }
//    Show data to the screen
    public void  showData(){
//    Need a node to duyệt các phần tử
//    Nút gần nhất tương đương đầu tàu
        Node crNode = head;
//      bây giờ thằng crNode sẽ đi lần lượt từng thằng 1 cho tới khi null, xong móc vào thằng kế tiếp
        while (crNode != null){
            System.out.println("Phần tử sau khi thêm là: " + crNode.data);
            crNode = crNode.next;
        }

    }
}

