package demoArray;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
// //    bình phương trong mảng
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            sc.nextLine();
//        }
//        for (int i = 0; i < n; i++) {
//            arr[i] = arr[i] * arr[i];
//            System.out.print(arr[i] + " ");
//        }
//    }
////    Loại bỏ phần tử mình muốn - dùng ArrayList
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập kích thước mảng: ");
//        ArrayList<Integer> al = new ArrayList<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập vị trí thứ " +i+ ": ");
//            Integer itg = sc.nextInt();
//            al.add(itg);
//        }
//        System.out.print("Vị trí bạn muốn loại bỏ: ");
//        int k = sc.nextInt();
//        al.remove(k);
//        for (int number : al){
//            System.out.println(number + " ");
//        }
//    }
/*    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập kích cỡ: ");
//        int n = sc.nextInt();
//        int [] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Vị trí thứ " +i+ ": ");
//            a[i] = sc.nextInt();
//        }
//
//        System.out.print("Vị trí muốn dịch chuyển: ");
//        int viTri = sc.nextInt();
//
//        for (int i = 0; i < viTri; i++) {
//            int kq = a[0];
//            for (int j = 0; j < n; j++) {
//                if (j < n - 1) {
//                    a[j] = a[j + 1];
//                } else {
//                    a[j] = kq;
//                }
//            }
//        }
//    //    in ra
//        System.out.print("Kết quả: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
}
*/
    public static void swap(int[]a){
        for (int i = 0; i < a.length; i++){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        swap(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}


