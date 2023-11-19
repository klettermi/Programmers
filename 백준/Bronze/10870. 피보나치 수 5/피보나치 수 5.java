import java.util.Scanner;

public class Main {
    static int[] fibo;
    public int solution(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==0) return 0;
        else if(n == 1) return fibo[1] = 1;
        else if(n == 2) return fibo[2] = 1;
        else{
            return fibo[n] = solution(n-2) + solution(n-1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];
        System.out.println(T.solution(n));
    }
}
