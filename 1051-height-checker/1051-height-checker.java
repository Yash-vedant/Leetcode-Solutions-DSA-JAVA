class Solution {
    public int heightChecker(int[] heights) {
        
        int [] copy = new int[heights.length];

        int k =0;
        for(int n : heights){
        copy[k++] = n;
        }

        for(int i = 0 ; i<copy.length ; i++){
            for(int j = i+1 ; j<copy.length ; j++){
                if(copy[i]>copy[j]){
                    int temp = copy[j];
                    copy[j] = copy[i];
                    copy[i] = temp;
                }
            }
        }

        int count = 0 ;
        for(int i = 0 ;i<heights.length ; i++){
            if(heights[i]!=copy[i]){
                count++;
            }
        }
        return count;
    }
}