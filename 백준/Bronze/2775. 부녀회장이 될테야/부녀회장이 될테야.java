import java.util.Scanner;

public class Main {
    static int dp[][] = new int[15][15];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int j = 1; j < 15; j++){
            dp[0][j] = j;
        }

        for(int l = 1; l < 15; l++){
            for(int m = 1; m < 15; m++){
                for(int o = 1; o <= m; o++){
                    dp[l][m] += dp[l-1][o];
                }
            }
        }

        for(int i = 0; i < t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(dp[k][n]);
        }
    }
}
