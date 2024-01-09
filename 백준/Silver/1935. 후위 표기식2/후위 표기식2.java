import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int[] nums = new int[n];


        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(br.readLine());
            for(int j = 0; j < s.length; j++){
                char c = s[j].charAt(0);
                if(c == (char)(i+65)){
                    s[j] = String.valueOf(nums[i]);
                }
            }
        }

        Stack<String> stack = new Stack<>();
        for(String a : s){
            if(!a.isEmpty()){
                if(a.equals("+")||a.equals("-")||a.equals("/")||a.equals("*")){
                    double num2 = Double.parseDouble(stack.pop());
                    double num1 = Double.parseDouble(stack.pop());
                    switch (a){
                        case "+":
                            stack.push(String.format("%.2f",(num1 + num2)));
                            break;
                        case "-":
                            stack.push(String.format("%.2f",(num1 - num2)));
                            break;
                        case "*":
                            stack.push(String.format("%.2f",(num1 * num2)));
                            break;
                        case "/":
                            stack.push(String.format("%.2f",(num1 / num2)));
                            break;
                    }
                }else{
                    stack.push(a);
                }
            }

        }
        System.out.println(stack.pop());
    }
}
