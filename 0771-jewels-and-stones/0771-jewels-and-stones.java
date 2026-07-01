class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        char ch [] = jewels.toCharArray();

        int count = 0 ;

        for(int i = 0 ;i<ch.length ; i++){
            char c = ch[i];
            for(int j = 0 ; j<stones.length(); j++){
                if(stones.charAt(j)==c){
                    count++;
                }
            }
        }
        return count;
    }
}