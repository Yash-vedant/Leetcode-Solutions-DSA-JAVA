class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<Integer>();
			Set<Integer> set2 = new HashSet<Integer>();
			
			for(int i = 0 ;i<nums1.length; i++) {
				set1.add(nums1[i]);
			}
			
			for(int i = 0 ;i<nums2.length; i++) {
				set2.add(nums2[i]);
			}
			
			List<List<Integer>> allList = new ArrayList<List<Integer>>() ;
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			
			for(int num : set1) {
				if(!set2.contains(num)) {
					list1.add(num);
				}
			}
			
			for(int num : set2) {
				if(!set1.contains(num)) {
					list2.add(num);
				}
			}
			
			allList.add(list1);
			allList.add(list2);
			
			return allList;
    }
}