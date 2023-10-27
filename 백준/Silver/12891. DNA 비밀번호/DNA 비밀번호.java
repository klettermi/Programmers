import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public boolean check(int[] cnt, int[] check){
        boolean flag = false;

        for(int i = 0; i < check.length; i++){
            if(cnt[i] < check[i]) return false;
            else flag = true;
        }

        return flag;
    }
    public int solution(int s, int p, String dnaStr, int[] check){
        int answer = 0;

        int[] cnt  = new int[4];

        for(int i = 0; i < p; i++){
            if(dnaStr.charAt(i) == 'A') cnt[0]++;
            else if(dnaStr.charAt(i) == 'C') cnt[1]++;
            else if(dnaStr.charAt(i) == 'G') cnt[2]++;
            else if(dnaStr.charAt(i) == 'T') cnt[3]++;
        }

        if(check(cnt, check)) answer++;


        for(int i = p; i < s; i++){
            if(dnaStr.charAt(i-p) == 'A') cnt[0]--;
            else if(dnaStr.charAt(i-p) == 'C') cnt[1]--;
            else if(dnaStr.charAt(i-p) == 'G') cnt[2]--;
            else if(dnaStr.charAt(i-p) == 'T') cnt[3]--;

            if(dnaStr.charAt(i) == 'A') cnt[0]++;
            else if(dnaStr.charAt(i) == 'C') cnt[1]++;
            else if(dnaStr.charAt(i) == 'G') cnt[2]++;
            else if(dnaStr.charAt(i) == 'T') cnt[3]++;
            if(check(cnt, check)) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();
        String dnaStr = sc.next();
        int[] check = new int[4];
        for(int i = 0; i < 4; i++){
            check[i] = sc.nextInt();
        }

        System.out.println(T.solution(s, p, dnaStr, check));
    }
}
