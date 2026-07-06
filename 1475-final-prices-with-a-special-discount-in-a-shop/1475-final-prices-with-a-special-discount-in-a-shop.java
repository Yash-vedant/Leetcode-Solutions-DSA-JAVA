class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();
        int res[] = new int[prices.length];

        for(int i = prices.length-1 ;i>=0; i--){
            while(!stack.isEmpty() && prices[stack.peek()]>prices[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] = prices[i];
            }
            else{
                int num = stack.peek();
                res[i] = prices[i]-prices[num];

            }
            stack.push(i);
        }
        return res;
    }
}