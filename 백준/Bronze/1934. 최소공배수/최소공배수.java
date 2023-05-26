import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static int least(int a, int b) {
        int i = 1;
        int an = a > b ? b : a;
        int ans;
        while (true) {
            ans = an * i;
            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(least(a, b)).append("\n");
        }
        System.out.println(sb);
    }
}
