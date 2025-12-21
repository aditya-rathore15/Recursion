package basic;

import java.util.Scanner;

/*
Time complexity = 2^n

Example Recursion Tree:

                    f(4)
            f(3)            f(2)
       f(2)      f(1)   f(1)      f(0)
   f(1)     f(0)

for n=4 we made 9 recursion calls.

We can observe that every function call makes two function calls so

for n   -> we made 2 function calls
for n-1 -> we made 2 function calls
for n-2 -> we made 2 function calls

So we can say that in total we are making roughly 2^n function calls. Therefore, time complexity is 2^n.
 */

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