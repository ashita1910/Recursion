package recursion;

public class FibonacciSeriesCalculator {
    public int fibonacciCalc(int n) {
        if (n == 2 || n == 1)
            return n - 1;
        return fibonacciCalc(n - 1) + fibonacciCalc(n - 2);
    }
}