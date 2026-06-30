class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int ans [] = new int [nums.length*2];

        int c = nums.length;

        for(int j= 0; j<nums.length ; j++){
            ans[j] = nums[j];
        }

        for(int j = 0 , i = c ; j<nums.length ; j++ , i++){
            ans[i] = nums[j];
        }

        return ans;
    }
}