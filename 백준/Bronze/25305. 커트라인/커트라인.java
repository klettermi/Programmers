import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] ss = br.readLine().split(" ");
        int n = Integer.valueOf(ss[0]);
        int k = Integer.valueOf(ss[1]);

        Integer[] a = new Integer[n];
        String[] sa = br.readLine().split(" ");
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.valueOf(sa[i]);
        }

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a[k-1]);
    }
}
