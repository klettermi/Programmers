import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        boolean flag = false;
        for(String s : str){
            if(s.equals("<")){
                flag = true;
                if(!st.isEmpty()){
                    while(!st.isEmpty()){
                        sb.append(st.pop());
                    }
                }
                idx = sb.length();
                sb.append(">");
            }else if(s.equals(">")){
                flag = false;
                while(!st.isEmpty()){
                    sb.insert(idx, st.pop());
                }
                sb.insert(idx, "<");
            }else{
                if(s.equals(" ") && !flag){
                    while(!st.isEmpty()){
                        sb.append(st.pop());
                    }
                    sb.append(" ");
                }else{
                    st.push(s);
                }
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}
