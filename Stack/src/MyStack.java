public class MyStack {
//  Attribute
    int top;
    int maxSize;
//  khởi tạo mảng ngăn xếp
    Node [] stack;

//  constructor
    public MyStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        //khởi tạo stack = mảng Node có max
        this.stack = new Node[maxSize];
    }
//    check full
        boolean isFull() {
           return(top + 1 == maxSize);
        }

//    check empty
        boolean isEmpty() {
            return (top == -1);
        }

//    push
//    đẩy vào thì truyền thêm 1 nut
    public void push(Node node){
        if (!isFull()){
            top = top + 1;
            stack[top] = node;
        }else{
            System.out.print("Can not insert data ");
            System.exit(0);
        }
    }

//  pop
//  lấy ra thì trả về 1 nut
    public Node pop(){
        if(!isEmpty()){
//          lấy xong mới trừ
           Node node = stack[top];
           top = top - 1;
            return node;
        }else{
            System.out.print("Nothing data!");
            return null;
        }
    }

//  peek: hàm trả về phần tử trên cùng của ngăn xếp
//  check rỗng hay không rồi mới trả về
    public Node peek(Node node){
        if(isEmpty()){
            System.out.print("Danh sach rong");
            return null;
        }else{return stack[top];}
    }

//    in ra các phần tử ngăn xếp
//    duyệt từ 0 -> top. sau đó in ra data của từng node
    public void print(){
       for(int i = 0; i <= top; i ++){
           stack[i].print();
       }
    }

}
