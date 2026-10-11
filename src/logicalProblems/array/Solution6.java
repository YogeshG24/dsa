package logicalProblems.array;

public class Solution6 {

    /**
     * DESCRIPTION: Problem to calculate the average(Arithmetic Mean) of the given
     * sequence
     */

    public static void main(String[] args) throws Exception {
        int[] nums = { 7, 2, 9, 2, 4, 2, 1 };
        int size = nums.length;
        int sum = 0;

        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            sum += nums[currentIndex];
        }

        System.out.println("%f is the average of the sequence".formatted((float) sum / size));

    }

}
