package RecurisveTreeGraph;

import java.util.Scanner;

public class EX6 {
    static int[] arr;
    static int[] ch;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        ch = new int[n+1];
        for(int i = 1; i < n+1; i++) arr[i] = i;
        DFS(1);
    }
    private static void DFS(int L){
        if(L == n+1){
            for(int i = 1; i < ch.length; i++){
                if(ch[i] == 1) System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }
}
