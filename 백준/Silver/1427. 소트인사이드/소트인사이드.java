import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer[] a = new Integer[str.length()];
        String[] s = str.split("");
        for(int i = 0; i < s.length; i++){
            a[i] = Integer.valueOf(s[i]);
        }
        Arrays.sort(a, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for(int i : a){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
