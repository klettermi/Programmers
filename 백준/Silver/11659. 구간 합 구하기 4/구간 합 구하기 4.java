import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            if(i == 0) arr[0] = Integer.parseInt(st.nextToken());
            else{
                arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            if(s == 1) sb.append(arr[e-1]).append("\n");
            else sb.append(arr[e-1]-arr[s-2]).append("\n");
        }

        System.out.println(sb);
    }
}
