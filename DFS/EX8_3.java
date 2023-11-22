package DFS;

import java.util.Scanner;

public class EX8_3 {
    static int n, m;
    static int[] score, time;
    static int answer = 0;

    private static void dfs(int L, int scoreSum, int timeSum, int[] score, int[] time){
        if(timeSum > m) return;
        if(L == n){
            answer = Math.max(answer, scoreSum);
        }
        else{
            dfs(L+1, scoreSum+score[L], timeSum+time[L], score, time);
            dfs(L+1, scoreSum, timeSum, score, time);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        score = new int[n];
        time = new int[n];
        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        dfs(0, 0, 0, score, time);
        System.out.println(answer);
    }
}
