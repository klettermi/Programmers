import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.valueOf(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(Integer.valueOf(br.readLine()));

        Collections.sort(a, Collections.reverseOrder());
        for(int x : a) {
            sb.append(x);
            sb.append("\n");
        } 
        System.out.println(sb);
    }
}
