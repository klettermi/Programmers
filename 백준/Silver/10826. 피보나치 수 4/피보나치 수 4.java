import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BigInteger[] fibo;
    public BigInteger DFS(int n){
        if(fibo[n] != null) return fibo[n];

        if(n == 1) return fibo[n] = BigInteger.ONE;
        else if(n == 2) return fibo[n] = BigInteger.ONE;
        else return fibo[n] = DFS(n-2).add(DFS(n-1));
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new BigInteger[n+1];
        fibo[0] = BigInteger.ZERO;
        System.out.println(T.DFS(n));
    }
}
