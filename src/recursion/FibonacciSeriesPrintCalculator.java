package recursion;

public class FibonacciSeriesPrintCalculator {
    int a = 0;
    int b = 1;
    int c = 0;
    /*public void FibonacciSeries(int n, int a, int b){
        if(n == 0 || n == 2)
            return;
        else if(n == 1)
            System.out.println("0");
        else if(n > 2){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            FibonacciSeries(n - 1, a, b);
        }
    }*/
    public void Fibonacci(int n){
        if(n == 0)
            return;
        else if(n == 1)
            System.out.println("0");
        else if(n > 2){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            Fibonacci(n - 1);
        }
    }
}
//0 1 1 2 3 5 8 13 21 34 55 89 144 233

