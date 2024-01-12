import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] strs = br.readLine().toCharArray();
        char[] bomb = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : strs) {
            stack.push(c);

            if (stack.size() >= bomb.length) {
                boolean isBomb = true;
                for (int i = 0; i < bomb.length; i++) {
                    if (stack.elementAt(stack.size() - bomb.length + i) != bomb[i]) {
                        isBomb = false;
                        break;
                    }
                }
                if (isBomb) {
                    for (int i = 0; i < bomb.length; i++) {
                        stack.pop();
                    }
                }
            }
        }

        // 삽입 대신 append 사용
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // StringBuilder를 뒤집음
        sb.reverse();

        System.out.println(sb.length() == 0 ? "FRULA" : sb);
    }
}