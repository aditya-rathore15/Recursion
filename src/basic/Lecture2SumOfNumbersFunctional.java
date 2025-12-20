package basic;

import java.util.Scanner;

public class Lecture2SumOfNumbersFunctional {

    private static int summation(int n){
        if(n==0) {
            return 0;
        }

        return n + summation(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(summation(n));
    }
}