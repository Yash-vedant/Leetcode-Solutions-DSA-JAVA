class Solution {
    public String truncateSentence(String s, int k) {
        
        String arr [] = s.split(" ");

        String sb = "";

        for(int i = 0 ; i<k ; i++){
            sb = sb+arr[i]+" ";
        }

        return sb.trim();
    }
}