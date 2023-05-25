import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuffer sb = new StringBuffer();
       Stack<Integer> st = new Stack<>();
       ArrayList<Integer> arr = new ArrayList<>();

       int n = Integer.parseInt(br.readLine());
       for(int i = 0; i < n; i++) // 입력된 수열
           arr.add(Integer.parseInt(br.readLine()));

       int idx = 0;
       for(int i = 1; i <= n; i++){
           st.push(i);
           sb.append("+").append("\n");
           while(!st.isEmpty() && Objects.equals(st.peek(), arr.get(idx))){
               st.pop();
               sb.append("-").append("\n");
               idx++;
           }
       }

       if(st.isEmpty())
           System.out.println(sb);
       else System.out.println("NO");
    }
}