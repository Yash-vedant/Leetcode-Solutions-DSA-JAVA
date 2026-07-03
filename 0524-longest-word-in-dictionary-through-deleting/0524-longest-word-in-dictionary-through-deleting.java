class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        
         String longest = "";
        for(String dc : dictionary){
            int left = 0 ;
            int right = 0 ;
            while(right<s.length()){
                if(left<dc.length() && dc.charAt(left)==s.charAt(right)){
                    left++;
                    right++;
                }
                else{
                    right++;
                }
            }
            if(dc.length()==left){
                if(dc.length()>longest.length()){
                    longest = dc;
                }
                else if (dc.length() == longest.length() && dc.compareTo(longest) < 0) {
                longest = dc;
                 }
            }
        }
        return longest;
    }
}