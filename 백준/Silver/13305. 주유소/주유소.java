import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dis = new int[n-1];
        int[] city = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n-1; i++){
            dis[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            city[i] = Integer.parseInt(st.nextToken());
        }

        int min = city[0];
        int sum = city[0] * dis[0];
        for(int i = 1; i < n-1; i++){
            if(min > city[i]){
                min = city[i];
                sum += city[i] * dis[i];
            }else{
                sum += min * dis[i];
            }
        }
        System.out.println(sum);
    }
}
