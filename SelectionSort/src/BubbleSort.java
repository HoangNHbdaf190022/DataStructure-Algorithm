public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {25, 28, 56, 564 ,41,1,2};

        for(int i = 0; i < arr.length; i++){ // n+1
            for (int j =  i + 1; j < arr.length; j++){ // n
                if (arr[i] > arr[j]){ // 1
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;

                }
            }
        }
        System.out.println("Các phần tử sau khi sắp xếp là:");
        for (int a : arr){
            System.out.print(a + " "); //O(n2)
        }
    }
}
