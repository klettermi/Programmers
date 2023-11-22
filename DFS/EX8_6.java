package DFS;

import java.util.Scanner;

public class EX8_6 {
    static int n, m;
    static int[] a, arr, check;
    private static void dfs(int L){
        if(L == m){
            for(int i = 0; i < m; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        else{
            for(int i = 0; i < n; i++){
                if(check[i]==0){
                    check[i] = 1;
                    a[L] = arr[i];
                    dfs(L+1);
                    check[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        check = new int[n];
        a = new int[m];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        dfs(0);
    }
}
