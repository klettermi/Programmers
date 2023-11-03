package SortingAndSearching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX6_4 {
    public void solution(int s, int n, int[] a){
        LinkedList<Integer> cache = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(cache.size() < s && !cache.contains(a[i])){
                cache.add(0, a[i]);
            }else{
                if(!cache.contains(a[i])){
                    cache.remove(cache.size()-1);
                    cache.add(0, a[i]);
                }else{
                    cache.remove(cache.indexOf(a[i]));
                    cache.add(0, a[i]);
                }
            }

        }

        for(int x : cache) System.out.print(x + " ");
    }
    public static void main(String[] args) {
        EX6_4 T = new EX6_4();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        T.solution(s, n, a);
    }
}
