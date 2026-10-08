package logicalProblems.array;

public class Solution1 {

    /**
     * DESCRIPTION: Problem to find the largest number from an array
     */

    public static void main(String[] args) throws Exception {

        int[] nums = { 7, 2, 9, 4, 1 };
        int max = nums[0];

        for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] > max)
                max = nums[currentIndex];
        }

        System.out.println("%s is the largest number from the given serquence".formatted(max));
    }

}
