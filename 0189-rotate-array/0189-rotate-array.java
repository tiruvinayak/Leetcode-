class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int start = nums.length - k;

        int[] result = new int[nums.length];

        int index = 0;

        for (int i = start; i < nums.length; i++) {
            result[index] = nums[i];
            index++;
        }

        for (int i = 0; i < start; i++) {
            result[index] = nums[i];
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}