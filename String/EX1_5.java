package String;

import java.util.Scanner;

public class EX1_5 {
    public String solution(String str){
        char[] l = str.toCharArray();
        int lt = 0, rt = l.length - 1;
        while(lt < rt){
            if(!Character.isAlphabetic(l[lt])) lt++;
            else if(!Character.isAlphabetic(l[rt])) rt--;
            else {
                char tmp = l[lt];
                l[lt] = l[rt];
                l[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(l);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX1_5 T = new EX1_5();
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
