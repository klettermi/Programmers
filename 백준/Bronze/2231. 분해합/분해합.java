import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    // 부분합 구하는 메소드
    public static int decomposition(int n, int len){
        int sum = n;

        for(int i = len-1; i >= 0; i--) {
            sum += (int) (n / Math.pow(10, i));
            n = (int) (n % Math.pow(10, i));
        }

        return sum;
    }

    // 최솟값 구하는 메소드
    public static int min(LinkedList<Integer> arr){
        if(!arr.isEmpty()) {
            int min = arr.get(0);
            for (int i : arr) {
                if (i < min)
                    min = i;
            }
            return min;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList <Integer> ans = new LinkedList<>();
        int len = (n + "").length();
        int i = 0;

        while(true){
            if(decomposition(i, len) == n){
                ans.add(i);
            }
            i++;
            if(i > n)
                break;
        }

        System.out.println(min(ans));
    }
}
