public class bai_12 {
    static int G_bai_12(int x, int n){
        if(n > 1){
            return x * G_bai_12(x, n - 1);
        }
        return x;
    }

    static int S_bai_12(int x, int n){
        if(n > 1){
            return G_bai_12(x,n) + S_bai_12(x, n - 1);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("kết quả: " + S_bai_12(3,3));
    }

}
