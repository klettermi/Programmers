package DFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EX8_5 {
    static int n, m, answer = Integer.MAX_VALUE;

    private static void dfs(int L, int sum, Integer[] arr){
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m){
            answer = Math.min(answer, L);
        }
        else{
            for(int i = 0; i < n; i++){
                dfs(L+1, sum+arr[i], arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Integer[] coin = new Integer[n];
        for(int i = 0; i < n; i++){
            coin[i] = sc.nextInt();
        }
        m = sc.nextInt();

        Arrays.sort(coin, Collections.reverseOrder());
        dfs(0, 0, coin);
        System.out.println(answer);
    }
}
