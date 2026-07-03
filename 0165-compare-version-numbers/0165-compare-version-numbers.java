class Solution {
    public int compareVersion(String version1, String version2) {
        
        String []arr1 = version1.split("\\.");
        String []arr2 = version2.split("\\.");

         int left = 0;
         int right =0;

         int res = 0;

         while(left<arr1.length || right<arr2.length){
            int first = 0;
            int second =0;
           if(left>=arr1.length){
            first = 0;
           }
           else{
             first = Integer.valueOf(arr1[left]);
           }
           if(left>=arr2.length){
            second = 0;
           }
           else{
             second = Integer.valueOf(arr2[right]);
           }
              
              if(first==second){
                res=0;
              }
              else if(first>second){
                res = 1;
                break;
              }
              else{
                res = -1;
                break;
              }
              left++;
              right++;
         }

         return res;

    }
}