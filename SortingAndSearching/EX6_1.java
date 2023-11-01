package SortingAndSearching;

import java.util.Scanner;

public class EX6_1 {
    public void solution(int n, int[] a){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++){
            int idx = i;
            int temp = 0;
            for(int j = i+1; j<n; j++){
              if(a[j] < a[idx]){
                  idx = j;
              }
            }
            temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
        }
        for(int i : a) System.out.print(i + " ");
    }
    public static void main(String[] args) {
        EX6_1 T = new EX6_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        T.solution(n, a);
    }
}
