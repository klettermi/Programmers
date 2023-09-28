import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[] basket = new int[n+1];

        for(int i = 1; i <= n; i++){
            basket[i] = i;
        }

        for(int k = 0; k < m; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.valueOf(st.nextToken());
            int j = Integer.valueOf(st.nextToken());
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for(int i = 1; i <= n; i++){
            sb.append(basket[i] + " ");
        }

        System.out.println(sb);
    }
}