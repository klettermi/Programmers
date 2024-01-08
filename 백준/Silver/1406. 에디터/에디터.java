import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            leftStack.push(str.charAt(i));
        }

        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++){
            String order = br.readLine();
            switch (order.charAt(0)){
                case 'L':
                    if(!leftStack.isEmpty()) rightStack.push(leftStack.pop());
                    break;
                case 'D':
                    if(!rightStack.isEmpty()) leftStack.push(rightStack.pop());
                    break;
                case 'B':
                    if(!leftStack.isEmpty()) leftStack.pop();
                    break;
                case 'P':
                    leftStack.push(order.charAt(2));
            }
        }

        while(!leftStack.isEmpty()) rightStack.push(leftStack.pop());
        StringBuilder sb = new StringBuilder();
        
        while(!rightStack.isEmpty()) sb.append(rightStack.pop());
        System.out.println(sb);
    }
}
