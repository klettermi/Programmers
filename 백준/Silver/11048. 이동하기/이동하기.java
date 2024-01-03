import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] arr;
    static Integer[][]dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        dp = new Integer[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = m-1; i >= 0; i--){
            if(i==m-1) dp[n-1][i] = arr[n-1][i];
            else dp[n-1][i] = arr[n-1][i] + dp[n-1][i+1];
        }

        System.out.println(solution(0, 0));
    }

    private static int solution(int a, int b){
        if(a == n-1){
            return dp[a][b];
        }
        if(dp[a][b] == null){
            if(b+1 > m-1) dp[a][b] = solution(a+1,b) + arr[a][b];
            else{
                dp[a][b] = Math.max(solution(a+1, b), Math.max(solution(a, b+1), solution(a+1, b+1))) + arr[a][b];
            }
        }

        return dp[a][b];
    }
}
