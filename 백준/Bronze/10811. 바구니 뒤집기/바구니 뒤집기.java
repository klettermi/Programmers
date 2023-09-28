import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[] basket = new int[n+1];

        for(int a = 1; a <= n; a++){
            basket[a] = a;
        }

        for(int b = 0; b < m; b++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.valueOf(st.nextToken());
            int j = Integer.valueOf(st.nextToken());

            List sub = new ArrayList<Integer>();

            for(int c = j; c >= i; c--){
                sub.add(basket[c]);
            }


            for(int p = 0, q = i; p < sub.size(); p++, q++){
                basket[q] = (int) sub.get(p);
            }

        }

        for(int i = 1; i <= n; i++){
            sb.append(basket[i] + " ");
        }
        System.out.println(sb);
    }
}
