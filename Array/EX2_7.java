package Array;

import java.util.Scanner;

public class EX2_7 {
    public int solution(int n, int[] arr){
        int answer = 0;
        int count = 1;
        int[] score = new int[n];
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count = 1;
                score[i] = 0;
            }
            else{
                score[i] = count;
                count++;
            }
        }
        for(int m : score){
            answer += m;
        }
        return answer;
    }
    public static void main(String[] args) {
        EX2_7 T = new EX2_7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
