class Solution {
    public int compress(char[] chars) {
        
        int i =0;
        int left = 0 ;
        while(left<chars.length){
            char c = chars[left];
            int count = 0;
            while(left<chars.length && chars[left]==c ){
                count++;
                left++;
            }
            if(count>1){
              chars[i++] = c;
               String s = String.valueOf(count);
               int k =0;
               while(k<s.length()){
                chars[i++] = s.charAt(k++);
               }
            }
            else{
               chars[i++] = c;
            }
        }
        return i;
    }
}