package logicalProblems.array;

public class Solution4 {
    /**
     * DESCRIPTION: Problem to count no of occurence in the sequence greater than
     * target
     */

    public static void main(String[] args) throws Exception {
        int[] nums = { 7, 2, 9, 2, 4, 2, 1 };
        int count = 0;
        int target = 4;

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] > target)
                count++;
        }

        System.out.println("%s numbers are greater than %d in the sequence".formatted(count, target));
    }
}