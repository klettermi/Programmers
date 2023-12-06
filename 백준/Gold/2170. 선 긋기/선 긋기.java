import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Line implements Comparable<Line>{
    int start, end;

    public Line(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Line ob){
        if(ob.start == this.start) return this.end - ob.end;
        return this.start - ob.start;
    }
}
public class Main {
    static int n;
    private static Long solution(ArrayList<Line> arr){
        Long answer = 0L;
        Collections.sort(arr);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int start = arr.get(0).start;
        int end = arr.get(0).end;
        for(Line ob : arr){
            if(ob.start > end){
                answer += end-start;
                start = ob.start;
                end = ob.end;
            }else{
                pQ.offer(ob.end);
                end = pQ.peek();
            }
        }
        answer += end-start;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Line> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr.add(new Line(s, e));
        }
        System.out.println(solution(arr));
    }
}
