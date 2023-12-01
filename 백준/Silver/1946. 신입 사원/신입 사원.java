import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Score implements Comparable<Score>{
    public int s, m;

    public Score(int s, int m) {
        this.s = s;
        this.m = m;
    }

    public int compareTo(Score o){
        if(o.s == this.s) return this.m - o.m;
        else return this.s - o.s;
    }
}
public class Main {
    private static int solution(int n, ArrayList<Score> arr){
        int cnt = 0;
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(Score ob : arr){
            if(min >= ob.m){
                cnt++;
                min = ob.m;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int k = 0; k < t; k++){
            ArrayList<Score> arr = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                arr.add(new Score(s, m));
            }
            System.out.println(solution(n, arr));
        }
    }
}
