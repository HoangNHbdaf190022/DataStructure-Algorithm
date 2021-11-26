public class bai_11 {
    static int G(int n){
        if (n > 1){
            return n * G(n-1);
        }
        return 1;
    }
    static int S(int n){
        if (n > 1){
            return S(n-1) + G(n);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
