public class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int max2=max;
        for (int i=1; i<nums.length; i++) {
            max=Math.max(nums[i],nums[i]+max);
            if(max>max2){
                max2=max;
            }
        }
        return max2;
    }
}