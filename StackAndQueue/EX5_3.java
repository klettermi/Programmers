package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class EX5_3 {
    public int solution(int n, int m, int[][] a, int[] b){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < m; i++){
            int pop = b[i] - 1;
            for(int j = 0; j < n; j++){
                if(a[j][pop] != 0){
                    if(stack.isEmpty()){
                        stack.add(a[j][pop]);
                    }
                    else if(stack.peek() == a[j][pop]){
                        answer += 2;
                        stack.pop();
                    }else{
                        stack.add(a[j][pop]);
                    }
                    a[j][pop] = 0;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        EX5_3 T = new EX5_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] pop = new int[m];
        for(int i = 0; i < m; i++){
            pop[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr, pop));
    }
}
