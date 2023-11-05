package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class EX6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = n-1;
        int mid = 0;
        while(start < end){
            mid = (start + end)/2;
            if(arr[mid] > m){
                end = mid - 1;
            }else if(arr[mid] == m) {
                System.out.println(mid+1);
                break;
            }
            else{
                start = mid + 1;
            }
        }
    }
}
