import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> Acc = new ArrayList<>();

        boolean flag = true;
        while(true) {
            System.out.println("Mời bạn nhập chức năng: "
                    + "\n1. Thêm tài khoản "
                    + "\n2. In thông tin tài khoản "
                    + "\n3. Rút tiền "
                    + "\n4. Nạp tiền "
                    + "\n5. Chuyển khoản "
                    + "\n6. Thoát");
            int option = sc.nextInt();
            switch (option) {
                case 1:{
                    Actions.addTK(Acc);
                    break;
                }

                case 2:{
                    Actions.printTK(Acc);
                    break;
                }

                case 3:{
                    Actions.rutTien(Acc);
                    break;
                }

                case 4:{
                    Actions.napTien(Acc);
                    break;
                }

                case 5:{
                    Actions.chuyenTien(Acc);
                    break;
                }

                case 6: {
                    System.out.println("Bạn đã thoát");
                    System.exit(0);
                    break;
                }
            }
        }

    }

}
