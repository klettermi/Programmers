import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        ArrayList <String> ans = new ArrayList<>();
        int n = sc.nextInt();
        int[] a = new int[n + 1]; // 0을 사용하지 않기 때문에 +1을 해줌
        int m = 1;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            st.push(i);
            ans.add("+");
            while (!st.empty() && st.peek() == a[m]) {
                st.pop();
                ans.add("-");
                m++;
            }
        }

        if (st.empty()) {
            for (String s : ans) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }

    }
}