import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long big = Math.max(A, B);
        long small = Math.min(A, B);
        StringBuilder sb = new StringBuilder();
        sb.append((big == small) ? 0 : (big - small - 1) + "\n");
        for (long i = small + 1; i < big; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}