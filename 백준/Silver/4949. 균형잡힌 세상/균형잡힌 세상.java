import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

// 균형잡힌 세상
public class Main {
    public static String vps(String s){
        String[] str = s.split("");
        Stack<String> stack = new Stack<>();

        for(String t : str){
            if(t.equals("(") || t.equals("[")) stack.push(t);
            else if(t.equals(")")){
                if(stack.isEmpty() || !stack.peek().equals("("))
                    return "no";
                else stack.pop();
            }
            else if(t.equals("]")){
                if(stack.isEmpty() || !stack.peek().equals("["))
                    return "no";
                else stack.pop();
            }
        }

        if(stack.isEmpty())
            return "yes";
        else return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true){
            String str = br.readLine();
            if(str.equals("."))
                break;
            sb.append(vps(str)).append("\n");
        }
        System.out.println(sb);
//        System.out.println(vps("([ (([( [ ] ) ( ) (( ))] )) ])."));
    }
}