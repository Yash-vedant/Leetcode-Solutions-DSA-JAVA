class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();

        int n = Math.max(word1.length() , word2.length());

        int i = 0;
        int j = 0;

        while((i < word1.length() || j < word2.length())) {
            if(i>=word1.length()){
                sb.append(word2.charAt(j));
                j++;
            }
            else if(j>=word2.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            else{
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(j));
                i++;
                j++;
            }
        }
        return sb.toString();
    }
}