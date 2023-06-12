import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String s = br.readLine();
            boolean flag = true;
            if(s.equals("0"))
                break;

            for(int i = 0; i < s.length() / 2; i++){
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    flag = false;
                }
            }

            String ans = flag == true? "yes" : "no";
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
