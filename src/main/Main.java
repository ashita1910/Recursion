/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 8:57 AM
 */

package main;

import recursion.FactorialCalculator;
import recursion.PowerCalculator;
import recursion.TowerOfHanoiSolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        /*FactorialCalculator calculator = new FactorialCalculator();
        System.out.println("Enter the number you want to find the factorial for: ");
        int number = scanner.nextInt();
        int calculatedFactorial = calculator.calculateFactorial(number);
        System.out.println("The factorial of " + number + " is : " + calculatedFactorial);
        System.out.println("Enter the no of disks:");
        int numberOfDisks = scanner.nextInt();
        TowerOfHanoiSolver towerOfHanoiSolver = new TowerOfHanoiSolver();
        towerOfHanoiSolver.hanoi(numberOfDisks, 'A', 'B', 'C');*/
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        System.out.println("Enter the power:");
        int power = scanner.nextInt();
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println("Power of number is:" + powerCalculator.powerCal(number, power));
    }
}
