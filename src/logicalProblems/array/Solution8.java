package logicalProblems.array;

public class Solution8 {

    /**
     * DESCRIPTION: Solution to find the 2nd distinct largest element from the
     * sequence.
     */

    public static void main(String[] args) throws Exception {

        int[] nums = { -9, -8, -1, 0 };

        if (nums.length == 0)
            System.out.println("There is no element present in the sequence");

        else if (nums.length == 1)
            System.out.println(
                    "There is no second largest element in the sequence as the sequence only contains a single element");

        else {

            int largestNumber = nums[0];
            int secondLargest = 0;
            boolean hasFound = false;

            for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
                if (nums[currentIndex] > largestNumber) {
                    secondLargest = largestNumber;
                    largestNumber = nums[currentIndex];
                    hasFound = true;
                } else if (nums[currentIndex] < largestNumber && (!hasFound || nums[currentIndex] > secondLargest)) {
                    secondLargest = nums[currentIndex];
                    hasFound = true;
                }
            }

            if (hasFound)
                System.out.println("%s is the 2nd largest element from the given sequence".formatted(secondLargest));
            else
                System.out.println("No second-largest distinct element found");
        }
    }

}
