import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack <Character> stack = new Stack<>();
        if(s.charAt(0) == ')') return false;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)=='(') stack.add('(');
            else if(s.charAt(i) == ')'){
                if(!stack.isEmpty()) stack.pop();
                else return false;
            }
        }
        if(!stack.isEmpty()) answer = false;
        return answer;
    }
}