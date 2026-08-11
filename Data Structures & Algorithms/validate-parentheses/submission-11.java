class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> closetoOpen=new HashMap<>();

        closetoOpen.put(')','(');
        closetoOpen.put(']','[');
        closetoOpen.put('}','{');

        for(char c:s.toCharArray()){
            if(closetoOpen.containsKey(c)){
                if(!stack.isEmpty()&&stack.peek()==closetoOpen.get(c)){
                     stack.pop();
                }
                else{
                    return false;
                    }
            }else{
                 stack.push(c);
            }
        }
    return stack.isEmpty();
        
    }
}
