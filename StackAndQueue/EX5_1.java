package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class EX5_1 {
    public String solution(String s){
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()) stack.add(s.charAt(i));
            else if(stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
            else stack.add(s.charAt(i));
        }
        if(stack.isEmpty()) answer = "YES";
        return answer;
    }
    public static void main(String[] args) {
        EX5_1 T = new EX5_1();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(T.solution(s));
    }
}
