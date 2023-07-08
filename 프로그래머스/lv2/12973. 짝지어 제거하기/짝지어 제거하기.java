import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek().equals(s.charAt(i)))
                stack.pop();
            else stack.push(s.charAt(i));
        }
        answer = stack.isEmpty()? 1 : 0;

        return answer;
    }
}