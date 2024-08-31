import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        List<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 1) odd.add(num);
        }

        if (odd.size() == 0) {
            System.out.println("-1");
        } else {
            Collections.sort(odd);

            Integer sum = 0;
            for (Integer i : odd) {
                sum += i;
            }

            System.out.println(sum);
            System.out.println(odd.get(0));
        }
    }
}