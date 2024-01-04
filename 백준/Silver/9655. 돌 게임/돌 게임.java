import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) System.out.println("SK");
        else if(n == 2) System.out.println("CY");
        else{
            int[] dp = new int[n+2];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 1;
            if(n >= 4){
                for(int i = 4; i <= n; i++){
                    dp[i] = Math.min(dp[i-1],dp[i-3]) + 1;
                }
            }

            if(dp[n] % 2 == 1) System.out.println("SK");
            else System.out.println("CY");
        }

    }
}
