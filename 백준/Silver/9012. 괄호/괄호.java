// 괄호
import java.io.*;
import java.util.*;
public class Main {
    public static String vps(String s){
        String[] str = s.split("");
        Stack<String> stack = new Stack<>();

        for(String t : str){
            if(t.equals("("))
                stack.push("*");
            else if(t.equals(")")){
                if(stack.isEmpty())
                    return "NO";
                else stack.pop();
            }

        }

        if(stack.isEmpty())
            return "YES";
        else return "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String str = br.readLine();
            sb.append(vps(str)).append("\n");
        }
        System.out.println(sb);
    }
}