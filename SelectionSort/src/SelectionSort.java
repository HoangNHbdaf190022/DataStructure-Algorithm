class SelectionSort {
    public void sort(int [] arr){
        int n = arr.length;
        // Cho vòng lặp for duyệt qua từng phần tử của mảng
        for(int i = 0; i < n - 1; i++){
            // tìm ptu nhỏ nhất trong mảng chưa đc sắp xếp
            int min_index = i;
            for(int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // Hoan doi ptu nho nhat va ptu dau tien
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    
    //Main
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();

        System.out.println("The origin array is:");
        int[] arr = {99, 1, 15, 30, 21};

        System.out.println("The array after sorting is:");
        ss.sort(arr);


    }


}