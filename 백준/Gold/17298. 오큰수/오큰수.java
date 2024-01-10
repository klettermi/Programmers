import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ls = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            ls[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && ls[stack.peek()] < ls[i]) {
                result[stack.pop()] = ls[i];
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        
        // Print the result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}