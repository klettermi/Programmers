import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int[][] dp = new int[31][31];
    public static int comb_cnt(int n, int r){
        if(dp[n][r] > 0){   // 이미 계산된 값일 경우
            return dp[n][r];
        }
        else if(n == r || r == 0) {
            return dp[n][r] = 1;
        }
        else return dp[n][r] = comb_cnt(n-1, r-1) + comb_cnt(n-1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);
            System.out.println(comb_cnt(m, n));
        }
    }
}
