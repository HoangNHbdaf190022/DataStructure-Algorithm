import java.util.ArrayList;
import java.util.Scanner;

public class Actions extends Account{
    //Thêm tài khoản
    static void addTK(ArrayList<Account> Acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tài khoản: ");
        long stk = sc.nextLong();
        System.out.println("Mời bạn nhập tên tài khoản: ");
        sc.nextLine();
        String tenTK = sc.nextLine();

        System.out.println("Có khởi tạo sẵn số tiền không: \n1. Có \n2. Không");
        int lc = sc.nextInt();

        switch(lc) {
            case 1:{
                System.out.println("Mời bạn nhập số tiền: ");
                double soTien = sc.nextDouble();
                Account A = new Account(stk, tenTK, soTien);
                Acc.add(A);
            }
            case 2:{
                Account B = new Account(stk, tenTK);
                Acc.add(B);
            }
        }

    }

    // In hóa đơn
    static void printTK(ArrayList<Account> Acc) {
        System.out.println("Mời bạn nhập tên tài khoản: ");
        Scanner sc = new Scanner(System.in);
        String tenTK = sc.nextLine();
        int index = -1;
        for(int i=0;i<Acc.size();i++) {
            if(Acc.get(i).getTenTaiKhoan().contains(tenTK)) {
                index = i;
                break;
            }
        }
        if(index==-1) {
            System.out.println("Tài khoản không tồn tại");
        }
        else
        {
            System.out.println(Acc.get(index));
        }
    }

    // Rút tiền
    static void rutTien(ArrayList<Account> Acc) {
        System.out.println("Mời bạn nhập tên tài khoản: ");
        Scanner sc = new Scanner(System.in);
        String tenTK = sc.nextLine();
        int index = -1;

        for(int i=0;i<Acc.size();i++) {
            if(Acc.get(i).getTenTaiKhoan().contains(tenTK)) {
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("Mời bạn nhập số tiền rút: ");
            int soTienRut = sc.nextInt();
            Acc.get(index).rutTien(soTienRut);
        } else {
            System.out.println("Tên TK không tồn tại");
        }
    }

    // Nạp tiền
    static void napTien(ArrayList<Account> Acc) {
        System.out.println("Mời bạn nhập tên tài khoản: ");
        Scanner sc = new Scanner(System.in);
        String tenTK = sc.nextLine();
        int index = -1;

        for(int i=0;i<Acc.size();i++)
            if (Acc.get(i).getTenTaiKhoan().contains(tenTK)) {
                index = i;
            }

        if (index != -1) {
            System.out.println("Mời bạn nhập số tiền nạp: ");
            int soTienNap = sc.nextInt();
            Acc.get(index).napTien(soTienNap);
        } else {
            System.out.println("Tên TK không tồn tại");
        }
    }

    // Chuyển tiền
    static void chuyenTien(ArrayList<Account> Acc) {
        System.out.println("Mời bạn nhập tên tài khoản người chuyển: ");
        Scanner sc = new Scanner(System.in);
        String tenTKChuyen = sc.nextLine();
        int index1 = -1;

        System.out.println("Mời bạn nhập tên tài khoản người nhận: ");
        String tenTKNhan = sc.nextLine();
        int index2 = -1;

        for(int i = Acc.size() - 1; i >= 0; i--) {
            if(Acc.get(i).getTenTaiKhoan().contains(tenTKChuyen)) {
                index1 = i;
            }
            if(Acc.get(i).getTenTaiKhoan().contains(tenTKNhan)) {
                index2 = i;
            }
        }

        if (index1 == -1) {
            System.out.println("Tên TK người chuyển không tồn tại");
        } else {
            if(index2==-1) {
                System.out.println("Tên TK người nhận không tồn tại");
            }
            else {
                System.out.println("Mời bạn nhập số tiền chuyển: ");
                int soTienChuyen = sc.nextInt();
                Acc.get(index1).chuyenTien(Acc.get(index2), soTienChuyen);
            }
        }
    }

}
