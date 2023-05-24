import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<>();
        LinkedList<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){ // 출력해야하는 값 받기
            arr.add(sc.nextInt());
        }

        for(int j = 1; j <= n; j++) // 큐 생성
            q.add(j);

        int s_idx = 0; // 시작 인덱스
        int cnt = 0; // 연산 횟수

        for(int i : arr){
            int idx = q.indexOf(i);
            if(Math.abs(s_idx - idx) < Math.abs(q.size() - Math.abs(idx - s_idx))){
                cnt += Math.abs(idx - s_idx);
                q.remove(idx);
            }else{
                cnt += Math.abs(q.size() -  Math.abs(idx - s_idx));
                q.remove(idx);
            }
            s_idx = idx;
        }

        System.out.println(cnt);
    }
}