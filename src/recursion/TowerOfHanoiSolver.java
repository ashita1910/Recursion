/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 9:02 AM
 */

package recursion;

public class TowerOfHanoiSolver {
    public static void showMove(char fromPeg, char toPeg){
        System.out.println("Move disk from Peg " + fromPeg + " " + "to " + toPeg + " ");
    }
    public void hanoi(int numberOfDisks, char fromPeg, char toPeg, char viaPeg){
        if(numberOfDisks == 0)
            return;
        hanoi(numberOfDisks - 1, fromPeg, viaPeg, toPeg);
        showMove(fromPeg, toPeg);
        hanoi(numberOfDisks - 1, viaPeg, toPeg, fromPeg);
    }
}
