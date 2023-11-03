package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class EX6_6 {
    public void solution(int n, int[] a){
        StringBuffer sb = new StringBuffer();
        int[] tmp = a.clone();
        Arrays.sort(tmp);
        for(int i = 0; i < n; i++){
            if(a[i] != tmp[i]) sb.append(i+1 + " ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        EX6_6 T = new EX6_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        T.solution(n, a);
    }
}
