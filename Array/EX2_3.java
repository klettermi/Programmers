package Array;

import java.util.Scanner;

public class EX2_3 {
    public String solution(int n, int[] aArr, int[] bArr){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++){
            if(aArr[i] == bArr[i]){
                sb.append("D");
                sb.append("\n");
            }
            else if((aArr[i] == 1 && bArr[i] == 3) ||
                    (aArr[i] == 2 && bArr[i] == 1) ||
                    (aArr[i] == 3 && bArr[i] == 2)){
                sb.append("A");
                sb.append("\n");
            }
            else{
                sb.append("B");
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        EX2_3 T = new EX2_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for(int i = 0; i < n; i++){
            aArr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            bArr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, aArr, bArr));
    }
}
