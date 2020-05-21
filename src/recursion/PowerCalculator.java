package recursion;

public class PowerCalculator {
    public int powerCal(int number, int power){
        /*if(power == 1)
            return number;*/
        if(power == 0)
            return 1;
        return number * powerCal(number, power - 1);
    }
}
