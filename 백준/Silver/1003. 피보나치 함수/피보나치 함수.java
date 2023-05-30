import java.util.Scanner;

public class Main {
    static Integer[][] dp = new Integer[41][2];
    public static Integer[] fibonacci(int n){
        // n에 대한 0, 1의 호출 횟수가 없을 때(탐색하지 않은 값일 때)
        if(dp[n][0] == null || dp[n][1] == null){
            dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return dp[n];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        dp[0][0] = 1; // n = 0일 때 0의 호출 횟수
        dp[0][1] = 0; // n = 0일 때 1의 호출 횟수
        dp[1][0] = 0; // n = 1일 때 0의 호출 횟수
        dp[1][1] = 1; // n = 1일 때 1의 호출 횟수

        int n = sc.nextInt();

        while(n --> 0){
            int m = sc.nextInt();
            fibonacci(m);
            System.out.println(dp[m][0] + " " + dp[m][1]);
        }

    }
}


