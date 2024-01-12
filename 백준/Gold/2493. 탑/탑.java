import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> index = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= size; i++){
            int num = Integer.parseInt(st.nextToken());
            while(true){
                if(!stack.empty()){
                    int top = stack.peek();
                    if(top > num){
                        sb.append(index.peek()).append(" ");
                        stack.push(num);
                        index.push(i);
                        break;
                    }else{
                        stack.pop();
                        index.pop();
                    }
                }else{
                    sb.append("0 ");
                    stack.push(num);
                    index.push(i);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
