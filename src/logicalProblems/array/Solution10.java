package logicalProblems.array;

import java.util.HashMap;
import java.util.Map;

public class Solution10 {

    /**
     * DESCRIPTION: Solution to find the earliest duplicate element by position
     */

    public static void hashmapSolution(int[] nums) {

        /**
         * DESCRIPTION: Optimized solution using HashMap
         */

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            frequency.put(nums[currentIndex], frequency.getOrDefault(nums[currentIndex], 0) + 1);
        }

        boolean hasFound = false;
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (frequency.get(nums[currentIndex]) > 1) {
                System.out.println("Earliest duplicated element: " + nums[currentIndex]);
                hasFound = true;
                break;
            }
        }

        if (!hasFound) {
            System.out.println("No duplicated element found");
        }

    }

    public static void main(String[] args) throws Exception {

        int[] nums = { 5, 3, 3, 5 };

        hashmapSolution(nums);

    }

}
