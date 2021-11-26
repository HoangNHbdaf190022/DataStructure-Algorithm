public class bai_1 {

    static double bai_1(int n){
        if (n > 1){
            return (Math.sqrt(n + bai_1(n-1)));
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("kết quả: " + bai_1(5));
    }
}
