class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i), top = ' ';
            if(ch == '(' || ch =='{' || ch =='['){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                top = stack.pop();
                }
                else{
                    return false;
                }
                if((top == '(' && ch ==')')||(top == '[' && ch ==']')||(top == '{' && ch =='}')){
                    i++;
                    continue;
                }
                else{
                    return false;
                }
            }
            i++;
        }
        if(!stack.isEmpty())return false;
        return true;
    }
}
