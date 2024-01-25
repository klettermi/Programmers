import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Balloon{
    int idx, dis;

    public Balloon(int idx, int dis) {
        this.idx = idx;
        this.dis = dis;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Balloon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            deque.add(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        while(!deque.isEmpty()){
            Balloon cur = deque.pollFirst();
            sb.append(cur.idx + " ");

            if(deque.size() == 1){
                sb.append(deque.pollFirst().idx + " ");
                break;
            }
            else if(cur.dis >= 0){
                for(int i = 0; i < cur.dis - 1; i++){
                    Balloon pop = deque.pollFirst();
                    deque.addLast(pop);
                }
            }else{
                for(int i = 0; i < -cur.dis ; i++){
                    Balloon pop = deque.pollLast();
                    deque.addFirst(pop);
                }
            }
        }

        System.out.println(sb);
    }
}
