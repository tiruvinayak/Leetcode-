class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int total = n * (n+1)/2;
      int actualnumber =0;
       for(int i =0;i<n;i++){
       actualnumber += nums[i];
       }
       return total - actualnumber;
    }
}