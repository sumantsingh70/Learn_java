public class practice_set {
//    static void multiplication(int n){
//        for (int i=1;i<=10;i++){
//            System.out.println(n + " X " + i + "= " + n*i);
//        }

//    static int sum(int n){
//        if (n==1){
//            return 1;
//        }
//        return n + sum(n-1);
//    }

    static int fib(int n){
        if (n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
//       //P-1
//        multiplication(5);

        //P-2
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //p-3
//        System.out.println("sum of 10 numbers:"+sum(10));

        //p-4
//        for (int i=4;i>=1;i--){
//            for (int j=i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //p-5
        // 0 1 1 2 3 5 8 13......
        int result = fib(5);
        System.out.println(result);
    }
}

