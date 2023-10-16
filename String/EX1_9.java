package String;

import java.util.Scanner;

public class EX1_9 {
    /**
    public Long solution(String str){
        str = str.toUpperCase().replaceAll("[A-Z]", "");
        Long answer = Long.valueOf(str);
        return answer;
    }
     **/
    /** ASCII
    public int solution(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57) answer=answer*10+(x-48);
        }
        return answer;
    }
     **/
    public int solution(String s){
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX1_9 T = new EX1_9();
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
