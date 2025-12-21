package basic;

import java.util.Scanner;

public class Lecture5MultipleRecursionCalls {

    private static int printFibonacci(int n) {
        if(n <= 1) return n;

        return printFibonacci(n-1) + printFibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(printFibonacci(n));
    }
}