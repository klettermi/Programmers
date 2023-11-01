import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int[] a = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            a[i] = Integer.valueOf(br.readLine());
            sum += a[i];
        }
        sb.append(sum/5);
        sb.append("\n");
        Arrays.sort(a);
        sb.append(a[2]);

        System.out.println(sb);
    }
}
