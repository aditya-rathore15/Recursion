package basic;

import java.util.ArrayList;

/*
Ex: arr{1,2,1} sum = 2

                                                            f(0,[],0)

                                f(1,[1],1)                                                 f(1,[],0)

                f(2,[1,2],3)                     f(2,[1],1)                 f(2,[2],2)                        f(2,[],0)

    f(3,[1,2,1],4)       f(3,[1,2],3)     f(3,[1,1],2)   f(3,[1],1)    f(3,[2,1],3)  f(3,[2],2)       f(3,[1],1)    f(3,[],0)
 */
public class Lecture7PrintAllSubsequenceWithGivenSum {
    private static void printAllSubsequenceWithSumK(int index, int[] arr, int n, ArrayList<Integer> list, int sum, int k) {
        if(index == n) {
            if(sum == k) {
                System.out.println(list);
            }

            return;
        }

        list.add(arr[index]);
        sum += arr[index];
        printAllSubsequenceWithSumK(index + 1, arr, n, list, sum, k);

        list.removeLast();
        sum -= arr[index];
        printAllSubsequenceWithSumK(index + 1, arr, n, list, sum, k);
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 1};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        printAllSubsequenceWithSumK(0, arr, n, list, 0, 2);
    }
}
