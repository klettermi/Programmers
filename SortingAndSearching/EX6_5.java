package SortingAndSearching;

import java.util.Scanner;

public class EX6_5 {
    public String solution(int n, int[] a){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                else if(a[i] == a[j]) return "D";
            }
        }
        return "U";
    }
    public static void main(String[] args) {
        EX6_5 T = new EX6_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(T.solution(n, a));
    }
}
