package String;

import java.util.ArrayList;
import java.util.Scanner;

public class EX1_4 {
    /*
    public String solution(String str){
        String answer = "";
        for(int i = str.length()-1; i >= 0; i--){
            answer += str.charAt(i);
        }
        return answer;
    }
    */

    /*
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
     */

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        EX1_4 T = new EX1_4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
