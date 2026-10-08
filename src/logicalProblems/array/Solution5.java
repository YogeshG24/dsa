package logicalProblems.array;

public class Solution5 {

    /**
     * DESCRIPTION: Problem to sum of all elements in the sequence
     */

    public static void main(String[] args) throws Exception {

        int[] nums = { 7, 2, 9, 2, 4, 2, 1 };
        int sum = 0;

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            sum += nums[currentIndex];
        }

        System.out.println("Sum of the sequence is %d".formatted(sum));

    }

}
