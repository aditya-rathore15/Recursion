package basic;

import java.util.ArrayList;

/*
Subsequence: A contiguous or non-contiguous sequence which follows order

Eg: arr{3,1,2}
Subsequence: {}, 3, 1, 2, (3,1), (1,2), (3,2), (3,1,2)
Subarrays: 3, 1, 2, (3,1), (1,2), (3,1,2)


Eg: arr {3,1,2}

                                                                f(0, [])

                                  f(1, [3])                                                 f(1, [])

                  f(2, [3,1])                     f(2, [3])                    f(2, [1])                    f(2, [])

       f(3, [3,1,2])         f(3, [3,1])    f(3, [3,2])   f(3, [3])      f(3, [1,2])   f(3, [1])    f(3,[2])        f(3,[])

 Ans:  (3,1,2)               (3,1)          (3,2)         (3)            (1,2)         (1)          (2)             {}


At every point we have two options take or not-take, the entire solution relies on this fundamental decision
 */
public class Lecture6PrintAllSubsequences {

    private static void printSubsequence(int index, ArrayList<Integer> list, int[] arr, int n) {
        if(index == n){
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        printSubsequence(index+1, list, arr, n);

        list.removeLast();
        printSubsequence(index+1, list, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequence(0, list, arr, n);
    }
}