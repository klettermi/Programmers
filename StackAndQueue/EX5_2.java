package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class EX5_2 {
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(stack.isEmpty() && c != '(' && c != ')') answer += c;
            else if(c == '(') stack.add(c);
            else if(c == ')' && stack.peek() == '(') stack.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        EX5_2 T = new EX5_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
