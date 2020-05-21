/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 8:57 AM
 */

package main;

import recursion.*;

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
        towerOfHanoiSolver.hanoi(numberOfDisks, 'A', 'C', 'B');
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        System.out.println("Enter the power:");
        int power = scanner.nextInt();
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println("Power of number is:" + powerCalculator.powerCal(number, power));
        System.out.println("Enter the no:");
        int n = scanner.nextInt();
        FibonacciTermCalculator fibonacciTermCalculator = new FibonacciTermCalculator();
        System.out.println(fibonacciTermCalculator.nTHTErmCalculator(n));
        System.out.println("Enter the no:");
        int n = scanner.nextInt();
        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        System.out.println(primeNumberCalculator.primeCalc(n, 2));*/
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        FibonacciSeriesPrintCalculator fibonacciSeriesPrintCalculator = new FibonacciSeriesPrintCalculator();
        if(n > 1)
            System.out.print("0 1 ");
        /*fibonacciSeriesPrintCalculator.FibonacciSeries(n, 0, 1);*/
        fibonacciSeriesPrintCalculator.Fibonacci(n);
    }
}