import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số học sinh: ");

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " +(i + 1)+ ": ");
            arr[i] = sc.next();
        }

        Student_list std = new Student_list();

        std.addMany(arr);
        std.showStudent();

    }
}


