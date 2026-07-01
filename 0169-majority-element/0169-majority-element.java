class Solution {
    public int majorityElement(int[] nums) {

       int l = nums.length/2;
	   int res = 0;
		
		for(int i = 0 ; i<nums.length ; i++) {
			int digit = nums[i];
			int count = 1 ;
			for(int j = i+1 ; j<nums.length ; j++) {
				if(nums[j]==digit) {
					count++;
				}
			}
			if(count>l) {
				res = nums[i];
			}
		} 
        return res;
    }
}