class Solution {
    public String reverseWords(String s) {
        
          String arr [] = s.split(" ");
		  
		  String result = "";
		  
		  for(int i = 0 ; i< arr.length ; i++) {
			  char ch [] = arr[i].toCharArray();
			  
			   int start = 0;
			   int end = ch.length-1;
			   
			   while(start<=end) {
				   char temp = ch[start];
				   ch[start] = ch[end];
				   ch[end] = temp ;
				   
				   start++;
				   end--;
			   }
			   
			   String rev = new String(ch);
			   result = result+rev+" ";
			  
		  }
	     return result.trim();
    }
}