package medium;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode 39

Whenever the problem is about picking up elements from an array to form a combination, we start thinking in
take and not-take thought process.
 */
public class Lecture8CombinationSum {

    private void findCombination(int index, int[] arr, int target,
                                 List<List<Integer>> ans, List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Take
        ds.add(arr[index]);
        findCombination(index, arr, target - arr[index], ans, ds);
        ds.remove(ds.size() - 1);

        // Not take
        findCombination(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(0, candidates, target, result, new ArrayList<>());
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        Lecture8CombinationSum lect = new Lecture8CombinationSum();
        List<List<Integer>> result = lect.combinationSum(arr, 7);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}