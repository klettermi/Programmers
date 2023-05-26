import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public static int largest(int a, int b){
        int max = a > b? b : a;
        int i = 1;
        int ans = 1;
        while(i <= max){
            if(a % i == 0 && b % i == 0)
                ans = i;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        sb.append(largest(a, b)).append("\n").append(least(a, b));

        System.out.println(sb);
    }
}
