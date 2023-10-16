package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EX1_3 {
//    public String solution(String str){
//        String[] array = str.split(" ");
//        int len = array[0].length();
//        String answer = array[0];
//        for(String s : array){
//            if(s.length() > len){
//                len = s.length();
//                answer = s;
//            }
//        }
//        return answer;
//    }
public String solution(String str){
    int m = Integer.MIN_VALUE, pos;
    String answer = "";
    while((pos = str.indexOf(' ')) != -1){
        String tmp = str.substring(0, pos);
        int len = tmp.length();
        if(len > m){
            m = len;
            answer = tmp;
        }
        str = str.substring(pos+1);
    }
    if(str.length() > m){
        answer = str;
    }
    return answer;
}

    public static void main(String[] args) {
        EX1_3 T = new EX1_3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }
}
