class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i = 1 , j=0 ; i<nums.length ; i++ , j++){
            int d = nums[j];
            nums[i] = nums[i]+d;
        }

        return nums;
    }
}