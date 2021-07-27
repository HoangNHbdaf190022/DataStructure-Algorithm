package mang_xoay_vong;

public class Main_CA {
    public static void main(String[] args) {
        Circular_Array ca = new Circular_Array(5);

        ca.enqueue(1);
        ca.enqueue(2);
        ca.enqueue(3);

        ca.swap(1);
        ca.display();
    }
}
