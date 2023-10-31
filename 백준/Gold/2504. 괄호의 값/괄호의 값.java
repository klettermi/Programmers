import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public int solution(String s){
        int answer = 0;
        String[] ss = s.split("");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < ss.length; i++){
            if(stack.isEmpty()) stack.push(ss[i]);
            else{
                if(ss[i].equals("(") || ss[i].equals("[")) stack.push(ss[i]);
                else if(!isInteger(stack.peek())){
                    if(stack.peek().equals("(") && ss[i].equals(")")) {
                        stack.pop();
                        stack.push("2");
                    }
                    else if(stack.peek().equals("[") && ss[i].equals("]")) {
                        stack.pop();
                        stack.push("3");
                    }
                }else{
                    answer = 0;
                    while(!stack.isEmpty() && isInteger(stack.peek())){
                        answer += Integer.valueOf(stack.pop());
                    }
                    if(stack.isEmpty()) return 0;
                    if(stack.peek().equals("(") && ss[i].equals(")")){
                        stack.pop();
                        stack.push((2*answer) + "");
                    }
                    else if(stack.peek().equals("[") && ss[i].equals("]")){
                        stack.pop();
                        stack.push((3*answer) + "");
                    }
                }
            }
        }
        answer = 0;
        for(String a : stack){
            try{
                answer += Integer.valueOf(a);
            }catch (NumberFormatException e){
                return 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(T.solution(s));
    }
}
