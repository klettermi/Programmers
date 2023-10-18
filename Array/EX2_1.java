package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class EX2_1 {
    /* 내가 작성한 코드
    public String solution(int[] arr){
        StringBuffer sb = new StringBuffer();
        sb.append(arr[0]);
        sb.append(" ");
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] < arr[i]){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        EX2_1 T = new EX2_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            arr[i] = m;
        }

        System.out.println(T.solution(arr));
    }
     */

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EX2_1 T = new EX2_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.println(x + " ");
        }
    }
}
