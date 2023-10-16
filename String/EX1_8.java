package String;

import java.util.Scanner;

public class EX1_8 {
    /**
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int st = 0;
        int lt = str.length()-1;
        while(st < lt){
            if(!Character.isAlphabetic(str.charAt(st))){
                st++;
            }else if(!Character.isAlphabetic(str.charAt(lt))){
                lt--;
            }else{
                if(str.charAt(st) != str.charAt(lt)){
                    return "NO";
                }
                st++;
                lt--;
            }
        }
        return answer;
    }
     **/
    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) return "YES";
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX1_8 T = new EX1_8();
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
