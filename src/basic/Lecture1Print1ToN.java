package basic;

import java.util.Scanner;

public class Lecture1Print1ToN {
    private static void print(int i, int n) {
        if(i > n) {
            return;
        }

        System.out.println(i);
        print(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        print(1, n);
    }
}
