import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        for(int i = 0; i < dp.length; i++)
            dp[i] = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(padoban(n)).append("\n");
        }

        System.out.println(sb);
    }

    static long padoban(int n){
        dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;
        if(dp[n] != -1)
            return dp[n];

        if(n > 5){
            dp[n] = padoban(n - 1) + padoban(n - 5);
        }
        return dp[n];
    }
}
