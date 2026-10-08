package logicalProblems.array;

public class Solution2 {

    /**
     * DESCRIPTION: Problem to find the smallest number from an array
     */

    public static void main(String[] args) throws Exception {

        int[] nums = { 7, 2, 9, 4, 1 };
        int min = nums[0];

        for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] < min)
                min = nums[currentIndex];
        }

        System.out.println("%s is the smallest number from the given serquence".formatted(min));
    }

}
