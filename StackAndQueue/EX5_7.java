package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX5_7 {
    public String solution(String primary, String course){
        String answer = "NO";
        Queue<Character> queue = new LinkedList<>();
        for(char c : primary.toCharArray()){
            queue.offer(c);
        }
        for(char c : course.toCharArray()){
            if(queue.contains(c)){
                if(c == queue.peek()){
                    answer = "YES";
                    queue.remove();
                }else return "NO";
            }
        }
        if(!queue.isEmpty()) answer = "NO";
        return answer;
    }
    public static void main(String[] args) {
        EX5_7 T = new EX5_7();
        Scanner sc = new Scanner(System.in);
        String primary = sc.next();
        String course = sc.next();

        System.out.println(T.solution(primary, course));
    }
}
