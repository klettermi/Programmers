package String;

import java.util.Scanner;

public class EX1_11 {
    /** 내 답안
    public String solution(String str){
        String answer = "";
        str = str+" ";
        char c = str.charAt(0);
        int cnt = 1;

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == c){
                cnt++;
            }else{
                if(cnt == 1) answer += c;
                else answer += c + "" + cnt;
                cnt = 1;
                c = str.charAt(i);
            }
        }
        return answer;
    }
    **/
    public String solution(String str){
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                answer += str.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EX1_11 T = new EX1_11();
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
