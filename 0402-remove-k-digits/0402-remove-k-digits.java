class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        //monotonic increasing stack
        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        //if removals still left, remove from end
        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        int x = 0;
        while(x < sb.length() && sb.charAt(x) == '0'){
            x++;
        }

        String ans = sb.substring(x);

    return ans.length() == 0 ? "0" : ans.toString();
    }
}
