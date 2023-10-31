package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX5_6 {
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) queue.offer(i);
        int count = 0;
        while(queue.size()>1){
            count++;
            if(count!=k){
                queue.offer(queue.peek());
                queue.remove();
            }else{
                queue.remove();
                count = 0;
            }
        }
        answer = queue.peek();
        return answer;
    }
    public static void main(String[] args) {
        EX5_6 T = new EX5_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(T.solution(n, k));
    }
}
