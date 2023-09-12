import java.util.Scanner;

public class Main {
    static int dp[] = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= t; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[t]);
    }
}
