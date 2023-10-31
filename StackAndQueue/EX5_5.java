package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class EX5_5 {
    /*
    public int solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                answer += stack.size();
                flag = true;
            }
            else if(s.charAt(i) == ')' && flag == true){
                flag = false;
            }
            else if(s.charAt(i) == '(') stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
                answer++;
            }
        }
              return answer;
    }
    */

    public int solution(String str){
        int cnt=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1)=='(') cnt+=stack.size();
                else cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        EX5_5 T = new EX5_5();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(T.solution(s));
    }
}
