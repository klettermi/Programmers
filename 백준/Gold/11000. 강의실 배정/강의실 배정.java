import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture2 implements Comparable<Lecture2>{
    int st;
    int et;

    public Lecture2(int st, int et) {
        this.st = st;
        this.et = et;
    }
    public int compareTo(Lecture2 ob){
        return this.st - ob.st;
    }
}
public class Main {
    static int n;
    private static int solution(ArrayList<Lecture2> arr){
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        Collections.sort(arr);
        pQ.offer(arr.get(0).et);
        for(int i = 1; i < n; i++){
            int st = arr.get(i).st;
            if(st >= pQ.peek()){
                pQ.poll();
            }
            pQ.offer(arr.get(i).et);
        }
        return pQ.size();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        ArrayList<Lecture2> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr.add(new Lecture2(s, e));
        }
        System.out.println(solution(arr));
    }
}
