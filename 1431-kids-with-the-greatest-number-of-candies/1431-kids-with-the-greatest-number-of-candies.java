class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        
	        List<Boolean> list = new ArrayList<Boolean>();

	        int maxCandies = candies[0];
	         
	         for(int i = 0 ; i<candies.length ; i++){
	            if(maxCandies<candies[i]){
	                maxCandies = candies[i];
	            }
	         }
	         
	         for(int i = 0 ; i<candies.length ; i++) {
	        	 if(candies[i]+extraCandies >= maxCandies) {
	        		 list.add(true);
	        	 }
	        	 else {
	        		 list.add(false);
	        	 }
	         }
             return list;
    }
}