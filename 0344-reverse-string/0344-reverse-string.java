class Solution {
    public void reverseString(char[] s) {
        //time : o(1) space complexity : o(n)
        int left=0;
        int right=s.length-1;
        while(left<right){
char temp = s[left];
s[left] = s[right];
s[right]= temp;
left++;
right--;
        }
    }
}