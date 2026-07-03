class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        if(k>0){
            Set<Integer> set = new HashSet<>();
            
            for(int n : nums){
                set.add(n);
            }

             for(int n : set){
            int sum = n+k;
            if(set.contains(sum)){
                count++;
            }
        }
        }
        else{
            Map<Integer,Integer> map = new HashMap<>();

            for(int n :  nums){
                map.put(n , map.getOrDefault(n , 0)+1);
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>=2){
                    count++;
                }
            }
        }
       return count;
       
    }
}