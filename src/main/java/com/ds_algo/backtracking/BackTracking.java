package com.ds_algo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> state, int idx) {

        if (idx == nums.length) {
            result.add(new ArrayList<>(state));
            return;
        }

        // Back tracking include/exclude pattern

        state.add(nums[idx]); //choose
        backtrack(nums, result,  state, idx + 1); //explore
        state.remove(state.size() - 1); // remove the current choice

        backtrack(nums, result, state, idx + 1); // explore
    }
}

/*
* Example Problems
* Subsets
* Partition Equal Subset
* Combination Sum
*
*
* */
