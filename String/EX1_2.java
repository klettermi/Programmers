package String;

import java.util.Scanner;

public class EX1_2 {
    public String solution(String str){
        String answer = "";
//        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)){
//                answer += Character.toUpperCase(x);
//            }else {
//                answer +=Character.toLowerCase(x);
//            }
//        }
        for(char x : str.toCharArray()){
            if(x >= 65 && x <= 90) answer += (char)(x + 32);
            else answer += (char)(x - 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        EX1_2 T = new EX1_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
