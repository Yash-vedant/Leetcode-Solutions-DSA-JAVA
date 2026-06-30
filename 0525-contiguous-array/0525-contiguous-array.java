class Solution {
    public int findMaxLength(int[] nums) {
        
        int res = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int sum =0;
        for(int i = 0 ; i<nums.length ; i++){
           if(nums[i]==1){
            sum+=nums[i];
           }
           else{
            sum-=1;
           }
          int length =0;
           if(sum==0){
            length = i+1;
           }
           else if(map.containsKey(sum)){
            length = i-map.get(sum);
           }
           else{
            map.put(sum , i);
           }
           if(res<length){
            res = length;
           }
        }
        return res;
    }
}