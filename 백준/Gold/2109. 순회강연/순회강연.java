import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture>{
    int time;
    int money;

    public Lecture(int time, int money) {
        this.time = time;
        this.money = money;
    }
    public int compareTo(Lecture ob){
        return ob.time - this.time;
    }
}
public class Main {
    static int max = 0;
    static int n;
    private static Long solution(ArrayList<Lecture> arr){
        Long answer = 0L;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for(int i = max; i >= 1; i--){
            for(; j < n; j++){
                if(arr.get(j).time < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            arr.add(new Lecture(time, money));
            if(max < time) max = time;
        }
        System.out.println(solution(arr));
    }
}
