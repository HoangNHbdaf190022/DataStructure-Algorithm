public class main_2 {
        //Đây là bài của Huy
        public static void main(String[] args) {
            System.out.println(sum1(5));
        }
        public static Double sum1(int n){
            if(n>1){
                return (Math.sqrt(n)-1)+sum1(n-1);
            }
            return 1.0;
        }
        public static Double sum2(int n){
            if(n>0) {
                return (Math.pow(n, 2) + sum2(n - 1));
            }
            return 0.0;
        }
        public static Double sum3(int n){
            if(n>1){
                return (1/n)+sum3(n-1);
            }
            return 1.0;
        }

        public static Double sum4(int n){
            if(n>1){
                return (1/2*n)+sum4(n-1);
            }
            return 0.5;
        }

        public static Double sum5(int n){
            if(n>0){
                return (1/(2*n+1))+sum5(n-1);
            }
            return 0.0;
        }
        public static Double sum6(int n){
            if(n>1){
                return (1/n*(n-1))+sum6(n-1);
            }
            return 0.0;
        }

        public static Double sum7(int n){
            if(n>1){
                return (n/(n+1))+sum7(n-1);
            }
            return 0.5;
        }

        public static Double sum8(int n){
            if(n>0){
                return ((2*n+1)/(2*n+2))+sum8(n-1);
            }
            return 0.0;
        }

        public static int sum9(int n){
            if(n>0){
                return (n)*sum9(n-1);
            }
            return 1;
        }

        public static Double sum10(int x,int n){
            if(n>0){
                return (Math.pow(x,n))+sum10(x-1,n-1);
            }
            return 0.0;
        }


        public static Double sum11(int n){
            if(n>1){
                int gt=1;
                for (int i=1;i<=n;i++){
                    gt*=i;
                }
                return (gt)+(sum11(n-1));
            }
            return 1.0;
        }

}
