import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Water implements Comparable<Water>{
    int s, e;

    public Water(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Water o){
        if(this.s == o.s) return this.e - o.e;
        return this.s - o.s;
    }

}
public class Main {
    static int n, l;
    static ArrayList<Water> water = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            water.add(new Water(s, e));
        }

        Collections.sort(water);

        int answer = 0;
        int start = water.get(0).s;

        for(Water w : water){
            if(w.e < start) continue;
            if(start < w.s) start = w.s;
            int margin = (w.e - start) % l;
            int number = (w.e - start) / l;
            if(margin == 0) {
                answer += number;
                start = w.e;
            }
            else{
                answer += number + 1;
                start = l - margin + w.e ;
            }
        }

        System.out.println(answer);
    }
}
