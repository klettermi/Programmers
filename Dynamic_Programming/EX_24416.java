import java.util.Scanner;

// fibonacci
public class EX_24416 {
    public static int fib(int n){
        if(n == 1 || n == 2) {
            return 1;
        }
        else{
            return(fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n){
        int[] f = new int[n + 1];
        int cnt = 0;
        f[1] = f[2] = 1;
        for(int i = 3; i < n + 1; i++){
            cnt++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n) + " " + fibonacci(n));
    }
}
