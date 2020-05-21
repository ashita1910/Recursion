package recursion;

public class PrimeNumberCalculator {
    public String primeCalc(int n, int i){
        if(n <= 2)
            return n  == 2 ? "Prime!" : "Not Prime!";
        else if(n % i == 0)
            return "Not Prime!";
        else if(i * i > n)
            return "Prime!";
        return primeCalc(n, i+1);
    }
}
