import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int a = 1;
        int b = 1;

        for(int i = k+1; i <= n; i++)
            a *= i;
        for(int i = 1; i <= n-k; i++)
            b *= i;
        System.out.println(a/b);

    }
}
