package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class EX5_4 {
    public int solution(String s){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) stack.add(c - '0');
            else{
                int op = stack.pop();
                int result = stack.pop();
                switch(c){
                    case '+':
                        stack.add(result + op);
                        break;
                    case '-':
                        stack.add(result - op);
                        break;
                    case '*':
                        stack.add(result * op);
                        break;
                    case '/':
                        stack.add(result / op);
                        break;
                }
            }
        }
        answer = stack.peek();
        return answer;
    }
    public static void main(String[] args) {
        EX5_4 T = new EX5_4();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.solution(str));
    }
}
