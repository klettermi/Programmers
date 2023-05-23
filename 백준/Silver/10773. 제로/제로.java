import java.util.*;
public class Main {
    public static Stack <Integer> st = new Stack<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < k; i++){
            int n = sc.nextInt();
            if(n != 0)
                st.push(n);
            else st.pop();
        }

        for(int i : st)
            cnt += i;

        System.out.println(cnt);
    }
}
