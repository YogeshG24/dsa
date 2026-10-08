package logicalProblems.array;

public class Solution3 {

    /**
     * DESCRIPTION: Probleme to count no of occurence of a target in the given
     * sequence
     */

    public static void main(String[] args) throws Exception {
        int[] nums = { 7, 2, 9, 2, 4, 2, 1 };
        int count = 0;
        int target = 2;

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] == target)
                count++;
        }

        System.out.println("%s occurs %d times".formatted(target, count));
    }

}
