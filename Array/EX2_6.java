package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EX2_6 {
    public static boolean decimal(int n){
        if(n == 1) return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public String solution(int n, String[] arr){
        StringBuffer sb = new StringBuffer();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            StringBuffer b = new StringBuffer(arr[i]);
            nums[i] = Integer.valueOf(String.valueOf(b.reverse()));
            if(decimal(nums[i])) sb.append(nums[i] + " ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        EX2_6 T = new EX2_6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        System.out.println(T.solution(n, arr));
    }
}
