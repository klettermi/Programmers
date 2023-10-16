package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EX1_10 {
    /** 내 답안 -> 풀지 못했음
    public String solution(String s, String t){
        String answer = "";
        String[] arr = s.split(t);

        for(String str : arr){
            for(int i = 0; i < str.length(); i++){
                if(i < str.length()/2){
                    answer += 1 + i + " ";
                }else{
                    answer += (str.length()- i) + " ";
                }
            }
            answer += 0 + " ";
        }
        return answer;
    }
     **/
    public int[] solution(String s, char t){
       // 왼쪽으로 한 번, 오른쪽으로 한 번 해서 비교
       int p = 1000;
       int[] ans = new int[s.length()];

       for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == t){
               p = 0;
               ans[i] = p;
           }else{
               p++;
               ans[i] = p;
           }
       }
       p = 1000;
       for(int i=s.length()-1; i>=0; i--){
           if(s.charAt(i) == t){
               p = 0;
           }else{
               p++;
               ans[i] = Math.min(ans[i], p);
           }
       }
       return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX1_10 T = new EX1_10();
        String s = sc.next();
        char t = sc.next().charAt(0);
        for(int x : T.solution(s, t)){
            System.out.print(x + " ");
        }
    }
}
