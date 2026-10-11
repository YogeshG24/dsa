package logicalProblems.array;

public class Solution7 {

    /**
     * DESCROIPTION: Problem to find the avergae(Arithmetic Mean) from a given
     * sequence for the elements larger than the target value
     */

    public static void main(String[] args) throws Exception {
        int[] nums = { 7, 2, 9, 2, 4, 2, 1 };
        int targetElement = 3;

        int count = 0, sum = 0;

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] > targetElement) {
                count++;
                sum += nums[currentIndex];
            }
        }

        System.out.println("%.2f is the average from given sequence elemnt's greater than the %d"
                .formatted((float) sum / count, targetElement));
    }
}
