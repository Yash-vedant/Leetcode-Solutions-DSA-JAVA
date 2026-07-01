class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        int rev =0;
        while(temp!=0){
          rev = rev*10+(temp%10);
          temp/=10;
        }
        if(x<0 ){
            return false;
        }
        if(x==rev){
            return true;
        }
        return false;
    }
}