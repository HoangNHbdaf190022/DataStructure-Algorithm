import java.util.Scanner;

public class Main {
//    bài 1

//    giới thiệu về fibo-áp dụng về việc sinh sản của loài thỏ
    public static int fibo(int n){
        if (n > 2){
            return fibo(n-1) + fibo(n-2);
        }else {
            return 1;
        }
    }

//    giai thừa
    public static int giaithua(int n) {
        if (n == 1){
            return 1;
        }else{
            return n * giaithua(n - 1);
        }
    }
    

//    main
    public static void main(String[] args) {

//        fibo
        System.out.println("fibo: " + fibo(6)); // => sau 6 tháng = 8 cặp

//        giai thua
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giai thừa: ");
        int n = sc.nextInt();
        System.out.print(giaithua(n));
    }

}

