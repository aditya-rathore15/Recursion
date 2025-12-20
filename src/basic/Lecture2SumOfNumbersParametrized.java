package basic;

/*
Implement recursive code to print summation of N numbers from 1 to n
 */


import java.util.Scanner;

public class Lecture2SumOfNumbersParametrized {

    private static void summation(int i, int sum) {
        if(i<1) {
            System.out.println(sum);
            return;
        }

        summation(i-1, sum+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        summation(n, 0);
    }
}