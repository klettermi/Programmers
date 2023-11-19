package RecurisveTreeGraph;

import java.util.Scanner;

public class EX7_1 {
    public void DFS(int n){
        if(n == 0) return;
        else{
            System.out.println(n);
            DFS(n-1);
        }
    }
    public static void main(String[] args) {
        EX7_1 T = new EX7_1();
        T.DFS(3);
    }
}
