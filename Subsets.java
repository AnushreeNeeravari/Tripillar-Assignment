package com.basics.tripillarAssignmentThree;

import java.util.ArrayList;
import java.util.List;

public class Subsets{
    public static void findSubsets(int[] nums, int i, List<Integer> current) {
        if (i == nums.length) {
            System.out.println(current);
            return;
        }
        current.add(nums[i]);
        findSubsets(nums, i + 1, current);
        current.remove(current.size() - 1);
        findSubsets(nums, i + 1, current);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        System.out.println("ALl possible subsets: ");
        findSubsets(numbers,0, new ArrayList<>());
    }
}
