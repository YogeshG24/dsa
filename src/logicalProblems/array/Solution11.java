package logicalProblems.array;

import java.util.HashMap;
import java.util.Map;

public class Solution11 {

    /**
     * DESCRIPTION: Solution to find the non-repeating element
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
            if (frequency.get(nums[currentIndex]) == 1) {
                System.out.println("Non-repeating element is: " + nums[currentIndex]);
                hasFound = true;
                break;
            }
        }

        if (!hasFound) {
            System.out.println("No non-repeating element found");
        }

    }

    public static void main(String[] args) throws Exception {

        int[] nums = { 5, 3, 3, 5, 1 };

        hashmapSolution(nums);

    }

}
