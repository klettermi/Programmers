package String;

import java.util.Scanner;

public class EX1_7 {
    /** 내 답변
    public String solution(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return "NO";
            }
        }
        return "YES";
    }
     **/

    /** 첫 번째
    public String solution(String str){
        str = str.toUpperCase();
        String answer = "YES";
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) answer = "NO";
            break;
        }
        return answer;
    }
     **/
    public String solution(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX1_7 T = new EX1_7();

        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
