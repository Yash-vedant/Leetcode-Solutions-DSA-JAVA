class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i<s.length() ; i++){
            if( s.charAt(i)!=')'){
                stack.push(s.charAt(i));
            }
            else{
                StringBuilder sb = new StringBuilder();
                char d = ' ';
                while(stack.peek()!='('){
                    d = stack.pop();
                        sb.append(d);
                }
                 stack.pop();
                int j =0;
                while(j<sb.length()){
                    stack.push(sb.charAt(j));
                    j++;
                }
               
            }
        }

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}