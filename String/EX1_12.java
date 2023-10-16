package String;

import java.util.Scanner;

public class EX1_12 {
    public String solution(int n,String str){
        String answer = "";
//        int idx = 0;
//        String[] arr = new String[n];
//        int id = 0;
//        while(id < n){
//            arr[id] =  str.substring(idx, idx+7);
//            if(idx+7 == str.length()) break;
//            id++;
//            idx = idx + 7;
//
//        }
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = arr[i].replaceAll("#", "1");
//            arr[i] = arr[i].replaceAll("[*]", "0");
//        }
//        for(String s : arr){
//            answer += (char) Integer.parseInt(s, 2);
//        }

        for(int i=0; i<n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EX1_12 T = new EX1_12();
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n,str));
    }
}
