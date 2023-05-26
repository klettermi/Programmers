import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++)
            arr.add(Integer.parseInt(st.nextToken()));

        Collections.sort(arr);

        int sum = 0;
        for(int i = n, j = 0; i > 0; i--, j++){
                sum += arr.get(j) * i;
        }
        System.out.println(sum);
    }
}
