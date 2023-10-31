package StackAndQueue;

import java.util.*;

public class EX5_8 {
    public int solution(int n, int m, Queue<Integer> queue){
        LinkedList<Integer> list = new LinkedList<>();
        for(int x : queue){
            list.add(x);
        }
        Collections.sort(list, Collections.reverseOrder());

        int count = 0;
        while(true){
            if(queue.peek() == list.get(0)) {
                count++;
                queue.poll();
                list.remove(0);
                if(m == 0) return count;
            }
            else{
                queue.offer(queue.peek());
                queue.poll();
            }
            if(m != 0) m--;
            else m = queue.size()-1;
        }
    }
    public static void main(String[] args) {
        EX5_8 T = new EX5_8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < n; i++){
            queue.offer(sc.nextInt());
        }

        System.out.println(T.solution(n, m, queue));
    }
}
