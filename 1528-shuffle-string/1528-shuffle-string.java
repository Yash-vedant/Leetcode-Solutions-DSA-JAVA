class Solution {
    public String restoreString(String s, int[] indices) {
        
        char ch [] = s.toCharArray();
        char res [] = new char[ch.length];
        for(int i = 0 ; i<indices.length ; i++){
           res[indices[i]] = ch[i];
        }

        String result = new String(res);
        return result;
    }
}