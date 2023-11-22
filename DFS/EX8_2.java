package DFS;

import java.util.Scanner;

public class EX8_2 {
    static int c, n;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;
    private static void dfs(int L, int sum, int[] arr){
        if(sum > c) return;
        if(L == n){
            answer = Math.max(answer, sum);
        }
        else{
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        dfs(0, 0, arr);

        System.out.println(answer);
    }
}
