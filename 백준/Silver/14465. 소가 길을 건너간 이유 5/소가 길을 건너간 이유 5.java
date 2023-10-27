import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int b, int[] broken){
        boolean[] lamp = new boolean[n];
        for(int i : broken){
            lamp[i-1] = true;
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for(int i = 0; i < k; i++){
            if(lamp[i] == true) cnt++;
        }

        for(int i = k; i < n; i++){
            if(lamp[i-k] == true) cnt--;
            if(lamp[i] == true) cnt++;

            if(cnt < min) min = cnt;
        }
        return min;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();
        int[] broken = new int[b];
        for(int i = 0; i < b; i++){
            broken[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, k, b, broken));
    }
}
