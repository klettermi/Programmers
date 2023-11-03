package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class EX6_7 {
    public void solution(int n, int[][] a){
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        EX6_7 T = new EX6_7();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                a[i][j] = sc.nextInt();
            }
        }

        T.solution(n, a);
    }
}
