package mang_xoay_vong;

public class Circular_Array {
    int first;
    int last;
    int maxSize;
    int[] queue;

    //    constructor
    public Circular_Array(int maxSize) {
        first = last = -1;
        queue = new int[maxSize];
        this.maxSize = maxSize;
    }

    //    isEmpty
    boolean isEmpty() {
        return first == -1 && last == -1;
//        return first = last = -1;
    }

    //    isFull
    boolean isFull() {
        return (last + 1) % maxSize == first;
    }

    //    enqueue
    void enqueue(int node) {
        if (isFull()) {
            System.out.print("Hàng đợi đầy!");
        } else {
            if (first == -1) {
                first = 0;
            }
            last = (last + 1) % maxSize;
            queue[last] = node;
        }
    }

    //     dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.print("Hàng đợi rỗng!");
            return -1;
        } else {
            int node = queue[first];
            first = (first + 1) % maxSize;
//            nếu first, last đều hết rồi thì ta reset luôn
            if (first == last) {
                first = last = -1;
            }
            return node;
        }
    }

    public void display() {
        // Duyệt i = first , i khác last; i = (i+ 1) %maxSize
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng");
        } else {
            int i;
            System.out.println("Vị trí First là: " + first);
            // In ra các phần tử từ first đến last -1
            for (i = first; i != last; i = (i + 1) % maxSize) {
                System.out.print(queue[i] + " ");
            }
            // In ra phần tử last
            System.out.println(queue[i]);
            System.out.println("Vị trí Last là :" + last);
        }
    }

    void swap(int k) {
        for (int i = 0; i < k; i++) {
            enqueue(dequeue());
        }
    }
}


