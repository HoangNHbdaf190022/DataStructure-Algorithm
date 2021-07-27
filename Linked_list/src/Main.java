import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
//        System.out.println();

//        int [] arr = {1, 2, 3};
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " +(i + 1)+ ": ");
            arr[i] = sc.nextInt();
        }

        MyList myList = new MyList();
//      now we can add, addMany and showData
        myList.addmany(arr);
        myList.showData();

//        myList.addPo(new Node(5), 1);
//        myList.showData();
    }
}
