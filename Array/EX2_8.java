package Array;

import java.util.Scanner;

public class EX2_8 {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        EX2_8 T = new EX2_8();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : T.solution(n, arr)){
            System.out.print(i + " ");
        }
    }
}
