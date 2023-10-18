package Array;

import java.util.Scanner;

public class EX2_2 {
    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EX2_2 T = new EX2_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
