class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;

        for(int nu : nums){
            map.put(nu , map.getOrDefault(nu , 0)+1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                list.add(entry.getKey());
            }
        }

        return list;
    }
}