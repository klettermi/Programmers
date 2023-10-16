package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EX1_6 {
    /*
    public String solution(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        char[] l = str.toCharArray();
        for(char c : l){
            if(!set.contains(c)) set.add(c);
        }
        String answer = "";
        for(char c : set){
            answer += c;
        }
        return answer;
    }
     */
    public String solution(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EX1_6 T = new EX1_6();
        System.out.println(T.solution(sc.next()));
    }
}
