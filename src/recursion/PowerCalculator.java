package recursion;

public class PowerCalculator {
    public int powerCal(int number, int power){
        if(power == 1)
            return number;
        return number * powerCal(number, power - 1);
    }
}
