import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());

            if (K == 1) {
                sb.append("1 1\n");
                continue;
            }

            ArrayList<Integer>[] pos = new ArrayList[26];
            for (int i = 0; i < 26; i++) {
                pos[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < W.length(); i++) {
                char c = W.charAt(i);
                pos[c - 'a'].add(i);
            }

            int minLen = Integer.MAX_VALUE;
            int maxLen = -1;

            for (int i = 0; i < 26; i++) {
                ArrayList<Integer> list = pos[i];
                if (list.size() < K) continue;

                for (int j = 0; j + K - 1 < list.size(); j++) {
                    int length = list.get(j + K - 1) - list.get(j) + 1;
                    if (length < minLen) minLen = length;
                    if (length > maxLen) maxLen = length;
                }
            }

            if (maxLen == -1) sb.append("-1\n");
            else sb.append(minLen).append(" ").append(maxLen).append("\n");
        }

        System.out.print(sb.toString());
    }
}
