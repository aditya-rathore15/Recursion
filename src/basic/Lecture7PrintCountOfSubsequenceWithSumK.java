package basic;

import java.util.ArrayList;

public class Lecture7PrintCountOfSubsequenceWithSumK {
    public static int printSubsequenceWithSumK(int index, int[] arr, int n, int sum, int k) {
        if(index == n) {
            if(sum == k) {
                return 1;
            }

            return 0;
        }

        sum = sum + arr[index];
        int l = printSubsequenceWithSumK(index + 1, arr, n, sum, k);

        sum = sum - arr[index];
        int r = printSubsequenceWithSumK(index + 1, arr, n, sum, k);

        return l+r;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;

        int result = printSubsequenceWithSumK(0, arr, n, 0, 2);
        System.out.println(result);
    }
}