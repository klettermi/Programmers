import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static Integer[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        dp = new Integer[n][n];

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < i+1 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            dp[n-1][i] = arr[n-1][i];
        }
        System.out.println(find_sum(0, 0));
    }
    static int find_sum(int a, int b) {

        if(a == n-1) {
            return dp[a][b];
        }

        if(dp[a][b] == null) {
            dp[a][b] = Math.max(find_sum(a+1, b), find_sum(a+1, b+1)) + arr[a][b];
        }

        return dp[a][b];

    }
}
