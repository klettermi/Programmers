package String;

import java.util.Scanner;

public class EX1_1 {
    public int solution(String a, char b){
        int count = 0;
        a = a.toUpperCase();
        b = Character.toUpperCase(b);
//        for(int i = 0; i < a.length(); i++){
//            if(a.charAt(i) == b){
//                count++;
//            }
//        }
        for(char x : a.toCharArray()){
            if(x == b) count++;
        }
        return count;
    }

    public static void main(String[] args){
        EX1_1 T = new EX1_1();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(T.solution(input1, input2));
    }
}
