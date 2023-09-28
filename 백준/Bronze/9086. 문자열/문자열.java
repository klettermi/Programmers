import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.valueOf(br.readLine());
        for(int i = 0; i < t; i++){
            String s = br.readLine();
            sb.append(s.substring(0, 1) + s.substring(s.length()-1, s.length()));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}