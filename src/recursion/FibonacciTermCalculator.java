/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 9:01 AM
 */

package recursion;

public class FibonacciTermCalculator {
    public int nTHTErmCalculator(int k){
        //base condition
        if(k==0 || k==1)
            return k;
        //add recursive call
        return nTHTErmCalculator(k-1) + nTHTErmCalculator(k-2);
    }
}
