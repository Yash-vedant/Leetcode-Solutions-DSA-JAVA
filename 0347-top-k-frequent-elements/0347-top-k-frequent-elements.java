class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer , Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0)+1);
        }

         int res[] = new int[k];
        for(int i = 0 ; i<k ;i++){
         int element = 0;
         int maxfreq = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq = entry.getValue();
                element = entry.getKey();
            }
        }
        res[i] = element;
        map.remove(element);
        }
        return res;
    }
}