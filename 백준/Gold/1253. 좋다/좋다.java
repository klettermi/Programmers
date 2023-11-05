import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int solution(int n, int[] a){
        int answer = 0;
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            int rt = 0, lt = n-1;
            while(rt < lt){
                if(rt == i) rt++;
                else if(lt == i) lt--;
                else{
                    int sum = a[rt] + a[lt];
                    if(sum < a[i]) rt++;
                    else if(sum > a[i]) lt--;
                    else{
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(str[i]);
        }
        System.out.println(T.solution(n, a));
    }
}
