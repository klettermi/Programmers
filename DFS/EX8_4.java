package DFS;

import java.util.Scanner;

public class EX8_4 {
    static int n, m;
    static int[] arr;

    private static void dfs(int L){
        if(L == m) {
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }
        else{
            for(int i = 1; i <= n; i++){
                arr[L] = i;
                dfs(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        dfs(0);
    }
}
