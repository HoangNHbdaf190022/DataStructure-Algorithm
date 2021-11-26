import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int lastLeft, int lastRight){
        if(lastLeft < lastRight){
            int pivot = sort(arr, lastLeft, lastRight);
            quickSort(arr, lastLeft,pivot-1);
            quickSort(arr,pivot + 1, lastRight);
        }
    }

    public static int sort(int[] arr, int lastLeft, int lastRight){
        int l = lastLeft, r = lastRight-1;
        while(true){
            while(l <= r && arr[l] < arr[lastRight]) {
                l++;
            }
            while(l < r && arr[r] > arr[lastRight]) {
                r--;
            }
            if(l >= r) {
                break;
            }
            int swap = arr[l];
            arr[l] = arr[r];
            arr[r] = swap;
            l++;
            r--;
        }
/*  Ta có hàm tiếp theo đó là hàm sort để sắp xếp các phần tử
    gồm có (Mảng, phần tử cuối cùng bên trái , phần tử cuối cùng bên phải)
    và ta thực hiện gán biến tên là l = lastLeft và biến r = lastRight - 1
    Chúng ta sẽ triển khai chúng trong vòng lặp while:
      và khi l <= r và mảng chứa phần tử l < mảng chứa lastRight thì l++
      ngược lại, khi l < r và mảng chứa r > mảng chứa lastRight thì r--
    Nếu mà l >= r rồi á thì dừng, break và ta cho 1 biến mới gọi là swap gán bằng arr[l]
    arr[l] = arr[r], arr[r] = swap đồng thời l tăng và r giảm Kết thúc vòng lặp while

    Ở bên ngoài vòng lặp while thì ta cho một biến mới gọi là xxx và gán nó = arr[l]
    arr[l] này sẽ bằng arr chứa các phần tử cuối cùng bên phải
    những phtu này lại bằng biến xxx, sau đó trả về l

 */
        int xxx = arr[l];
        arr[l] = arr[lastRight];
        arr[lastRight] = xxx;
        return l;
    }
    //main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin mời nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " +(i+1)+ ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Kết quả là:");
        quickSort(arr,0,n-1);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}











