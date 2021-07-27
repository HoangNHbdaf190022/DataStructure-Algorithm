public class Student_list {
    Node firstList;
    Node lastList;

//    constructor contain para & no para

    public Student_list() {}
    public Student_list(Node firstList, Node lastList) {
        this.firstList = null;
        this.lastList = null;
    }

//    check
    public boolean isEmpty() {return (this.firstList == null);}
//    add
    public void add(String s){
        Node newNode = new Node(s);
        if (isEmpty()){
            firstList = lastList = newNode;
        }else{
            lastList.next = newNode;
            lastList = newNode;
        }
    }

//    add many string
    public void addMany(String[] arr){
        for (String s : arr){
            add(s);
        }
    }

//    showStudent
    public void showStudent(){
//        chạy từ đầu đến cuối
        Node Node_hientai = firstList;
        while( Node_hientai != null){
            System.out.println("Học sinh được thêm là: " + Node_hientai.data);
            Node_hientai = Node_hientai.next;

        }
    }
}

