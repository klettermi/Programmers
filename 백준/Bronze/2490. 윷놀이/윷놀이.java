import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][4];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            Integer[] count = {0, 0};
            for (int k : arr[i]) {
                if (k == 0) count[0]++;
                else count[1]++;
            }

            if (count[0] == 1) System.out.println("A");
            else if (count[0] == 2 || count[1] == 2) System.out.println("B");
            else if (count[0] == 3) System.out.println("C");
            else if (count[0] == 4) System.out.println("D");
            else System.out.println("E");

        }
    }
}