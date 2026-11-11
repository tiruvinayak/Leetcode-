class Solution {
    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Skip duplicates
            if (nums[i] == first || nums[i] == second || nums[i] == third) {
                continue;
            }

            // First maximum
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            }

            // Second maximum
            else if (nums[i] > second) {
                third = second;
                second = nums[i];
            }

            // Third maximum
            else if (nums[i] > third) {
                third = nums[i];
            }
        }

        // Return third maximum if it exists, otherwise first maximum
        return (third == Long.MIN_VALUE) ? (int) first : (int) third;
    }
}