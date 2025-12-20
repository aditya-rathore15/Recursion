package basic;

import java.util.Scanner;

public class Lecture1PrintName {
    private static void printName(int i, int n) {
        if(i > n) {
            return;
        }

        System.out.println("Aditya");
        printName(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        printName(1, n);
    }
}
