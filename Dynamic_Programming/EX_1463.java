import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기
public class EX_1463 {
    public static int min_1(int n){
        int ans[] = new int [n+1];
        ans[1] = 0;

        for(int i = 2; i < n+1; i++){
            ans[i] = ans[i-1] + 1;
            if(i % 2 == 0 && ans[i] > ans[i/2] + 1) ans[i] = ans[i/2] + 1;
            if(i % 3 == 0 && ans[i] > ans[i/3] + 1) ans[i] = ans[i/3] + 1;
        }
        return ans[n];
    }

    public static int min_2(int n){
        int[] dp = new int[n + 1];
        dp[1] = 0;
        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i - 1] + 1;
            if(i % 3 == 0){
                if(dp[i / 3] + 1 < dp[i])
                    dp[i] = dp[i / 3] + 1;
            }
            if(i % 2 == 0){
                if(dp[i / 2] + 1 < dp[i])
                    dp[i] = dp[i / 2] + 1;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(min_1(n));
        System.out.println(min_2(n));
    }
}
