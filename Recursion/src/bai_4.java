public class bai_4 {
    static int bai_4(int n){
        if(n > 1){
            return bai_4(n-1) + bai_4(2*n);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("kết quả: " + bai_4(1));
    }
}
