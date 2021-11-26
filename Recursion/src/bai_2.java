import java.util.Scanner;

public class bai_2 {
    static int bai_2(int n){
        if (n > 0){
            return n *= bai_2(n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bai_2(n) + " ");
    }
}
