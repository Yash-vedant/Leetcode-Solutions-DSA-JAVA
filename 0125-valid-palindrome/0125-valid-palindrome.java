class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'  || c>='A' && c<='Z' || c>='0' && c<='9'){
                sb.append(Character.toLowerCase(c));
            }
        }
         
        String cleaned = sb.toString();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        return cleaned.equals(reversed);
    }
}