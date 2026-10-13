package logicalProblems.array;

import java.util.HashSet;
import java.util.Set;

public class Solution9 {

    /**
     * DESCRIPTION: Solution to find the first duplicate element
     */

    public static void nestedLoop(int[] nums) {

        /**
         * DESCRIPTION: Using nested loop to find the first duplicate element
         */

        int duplicateElement = 0;
        boolean foundDuplicate = false;

        hasFound: for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            for (int subIndex = 0; subIndex < currentIndex; subIndex++) {
                if (nums[subIndex] == nums[currentIndex]) {
                    duplicateElement = nums[currentIndex];
                    foundDuplicate = true;
                    break hasFound;
                }
            }
        }

        if (foundDuplicate)
            System.out.println("%d is the first duplicate element in the sequence".formatted(duplicateElement));
        else
            System.out.println("No duplicate element found");
    }

    public static void hashsetSolution(int[] nums) {

        /**
         * DESCRIPTION: Optimized the solution using HashSet
         */

        boolean hasFound = false;
        Set<Integer> visitedElements = new HashSet<>();

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (visitedElements.contains(nums[currentIndex])) {
                System.out.println("%d is the first duplicate element in the sequence".formatted(nums[currentIndex]));
                hasFound = true;
                break;
            } else {
                visitedElements.add(nums[currentIndex]);
            }
        }

        if (!hasFound)
            System.out.println("No duplicate element found");
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 4, 2, 7, 2, 9, 4 };

        // nestedLoop(nums);

        hashsetSolution(nums);
    }

}
