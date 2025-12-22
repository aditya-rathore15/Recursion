package basic;

import java.util.ArrayList;

public class Lecture7PrintSubsequenceWithGivenSum {

    public static boolean printSubsequenceWithSumK(int index, int[] arr, int n, ArrayList<Integer> list, int sum, int k) {
        if(index == n) {
            if(sum == k) {
                System.out.println(list);
                return true;
            }

            return false;
        }

        list.add(arr[index]);
        sum = sum + arr[index];
        if(printSubsequenceWithSumK(index + 1, arr, n, list, sum, k)) return true;

        list.removeLast();
        sum = sum - arr[index];
        if(printSubsequenceWithSumK(index + 1, arr, n, list, sum, k)) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequenceWithSumK(0, arr, n, list, 0, 2);
    }
}