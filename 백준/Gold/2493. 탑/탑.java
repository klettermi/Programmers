import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Top{
    int height;
    int index;

    public Top(int height, int index){
        this.height = height;
        this.index = index;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Top> tops = new Stack<>();

        for(int i = 1; i <= n; i++){
            int cur = Integer.parseInt(st.nextToken());
            if(!tops.isEmpty()){
                while(!tops.isEmpty()){
                    Top top = tops.peek();
                    if(top.height > cur){
                        sb.append(top.index).append(" ");
                        tops.push(new Top(cur, i));
                        break;
                    }else{
                        tops.pop();
                    }
                }
                if(tops.isEmpty()) sb.append("0 ");
                tops.push(new Top(cur, i));
            }else{
                tops.push(new Top(cur, i));
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
