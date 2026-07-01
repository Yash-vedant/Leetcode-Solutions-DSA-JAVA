class Solution {
    public String interpret(String command) {
        
        char ch [] = command.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<ch.length ; i++){
            if(ch[i]=='G'){
                sb.append('G');
            }
            if(ch[i]=='(' && ch[i+1]==')'){
                sb.append('o');
            }
            if(ch[i]=='(' && ch[i+1]=='a' && ch[i+2]=='l' && ch[i+3]==')'){
                sb.append("al");
            }
        }
        String result = sb.toString();
        return result;
    }
}