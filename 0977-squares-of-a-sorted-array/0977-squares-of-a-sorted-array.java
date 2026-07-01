class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int sorted [] = new int[nums.length];

        int left = 0 ;
        int right = nums.length-1;
        int pos = nums.length-1;

        while(left<=right){
            int leftsqr = nums[left]*nums[left];
            int rightsqr = nums[right]*nums[right];
            if(leftsqr>rightsqr){
                sorted[pos] = leftsqr;
                left++;
            }
            else{
                sorted[pos] = rightsqr;
                right--;
            }
            pos--;
        }
        return sorted;
    }
}