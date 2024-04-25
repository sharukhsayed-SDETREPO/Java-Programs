package JavaPrograms;

import java.math.BigInteger;

public class GenerateFibonacciSeries {
	public static void main(String[] args) {
        int n = 100; // Change this value to generate Fibonacci series up to a different number

        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    static void printFibonacciSeries(int n) {
        BigInteger firstTerm = BigInteger.ZERO;
        BigInteger secondTerm = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            BigInteger nextTerm = firstTerm.add(secondTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
