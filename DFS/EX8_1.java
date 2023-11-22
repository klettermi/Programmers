package DFS;

import java.util.Scanner;

public class EX8_1 {
    static int[] arr;
    static boolean flag;
    static String answer = "NO";
    static int n, total = 0;
    private static void dfs(int L, int sum, int[] arr){
        if(flag) return;
        if(sum > total/2) return;
        if(L==n){
            if((total - sum ) == sum){
                answer = "YES";
                flag = true;
            }
        }
        else{
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
