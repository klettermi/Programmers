import java.util.*;
class Solution {
   public boolean stack(String s){
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.add(s.charAt(i));
            }else{
                if((s.charAt(i) == ')' && stack.peek() == '(')
                    || s.charAt(i) == ']' && stack.peek() == '['
                    || s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.add(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()) flag = true;
        return flag;
    }
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            String a = s.substring(i) + s.substring(0, i);
            if(stack(a)) answer++;
        }
        return answer;
    }
}