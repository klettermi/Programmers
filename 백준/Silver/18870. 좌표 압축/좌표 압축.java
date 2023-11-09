import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public int[] solution(int n, Integer[] arr){
        int[] answer = new int[n];
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] sub =  set.toArray(new Integer[0]);

        Arrays.sort(sub);

        for(int i = 0; i < arr.length; i++){
            int start = 0, end = sub.length-1;
            while(start<= end){
                int mid = (start + end) / 2;
                if(sub[mid] > arr[i]){
                    end = mid-1;
                }else if(sub[mid] < arr[i]){
                    start = mid+1;
                }else {
                    answer[i] = mid;
                    break;
                }
            }

        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        for(int i : T.solution(n, arr)) sb.append(i).append(" ");
        System.out.println(sb);
    }
}
