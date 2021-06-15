public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;
        //int n = Integer.parseInt(args[0]);
       nFib(n);
    }
    static void nFib(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int iter = 1;
        System.out.print(fib1);
        while(iter < n){
            iter++;
            System.out.print(", " + fib2);
            int temp2 = fib1;
            fib1 = fib2;
            fib2 = temp2 + fib2;
        }
        //for (int i = 1; i < n; i++) {
            //System.out.print(", " + fib2);
            //int temp = fib1;
            //fib1 = fib2;
            //fib2 = temp + fib2;
        }
    }
//}

