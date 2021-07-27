    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//            System.out.print("Nhập kích thước ngăn xếp: ");
//            int n = sc.nextInt();
//            MyStack ms = new MyStack(n);
//            sc.nextLine();
//
//         for (int i = 0; i < n; i++){
//             System.out.print("Phần tử thứ " +(i+1)+ " là: ");
//             String data = sc.nextLine();
//             ms.push(new Node(data));
//         }
//            ms.print();

            MyStack ms = new MyStack(2);

            Node node1 = new Node("Nguyen");
            Node node2 = new Node("Huu");
            Node node3 = new Node("Hoang");

            ms.push(node1);
            ms.push(node2);
            ms.push(node3);

            ms.print();
        }
    }



