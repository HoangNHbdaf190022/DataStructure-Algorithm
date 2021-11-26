public class AA {



    static int spaceComp(int a, int b){ // a -> 4 bytes & b -> 4 bytes
        int sum;                  // sum -> 4 bytes
        sum = a + b;              // auxiliary space (sum) -> 4 bytes
        return sum;               // total = 16 bytes
    }

    static int sumOfArray(int[] arr){   // arr 🡪 N*4 bytes
        int sum = 0;                    // sum 🡪 4 bytes
        for (int j : arr) {             // j 🡪 4 bytes
            sum += j;                   // auxiliary 🡪 4 bytes
        }
        return sum;                     // total = 4 * N + 12
    }

    public static void main(String[] args) {

/*        int x = 10; // 1 time
        int y = 10; // 1 time
        int z = x+y; // 1 time
        System.out.println("Result = " + z); // 1 time*/

    // vòng lặp lồng nhau - độ phức tạp thời gian - nest loop

        int n = 10; // 1 time
        int sum = 0; // 1 time
        for (int i = 0; i < n; i++){ // n time
            for (int j = 0; j < n; j++){ // n time
                sum += i; // n * n time
                System.out.println("Result = " + sum); // 1 time
            }
        }



        //  độ phức tạp thời gian - Example with for loop

        /*int n = 100;                  // 1 time
        for (int i = 0; i < n; i++){  // n + 1 time
            System.out.println(i);    // n time
        }*/





        // => hàm tăng trưởng F(n) = constant
        // => hàm tăng trưởng F(n) phụ thuộc tuyến tính vào n

    }
}
