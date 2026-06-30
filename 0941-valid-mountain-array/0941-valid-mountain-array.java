class Solution {
    public boolean validMountainArray(int[] arr) {
        int peak = arr[0];
        int index = 0;
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>peak){
                peak = arr[i];
                index = i;
            }
        }

        if(arr[0]==peak || arr[arr.length-1]==peak){
            return false;
        }

       for(int i = 0  ; i<index ; i++){
             if(arr[i] >= arr[i+1]){
                return false;
             }
       } 

         for(int j = index; j < arr.length - 1; j++) {
            if(arr[j] <= arr[j + 1]) {
                return false;
            }
        }

         return true;
       }

      
    }
