package Array;

import java.util.Scanner;

public class EX2_5 {
    public int solution(int n){
        boolean[] flags = new boolean[n+1];
        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(flags[i] != true){
                for(int j = 1; j <= n/i; j++){
                    flags[j*i] = true;
                }
                answer++;
            }
        }
        return  answer;
    }
    public static void main(String[] args) {
        EX2_5 T = new EX2_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
