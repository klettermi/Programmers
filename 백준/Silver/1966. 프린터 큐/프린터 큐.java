import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Paper{
    int idx, weight;

    public Paper() {
    }

    public Paper(int idx, int weight) {
        this.idx = idx;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int k = 0; k < t; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            LinkedList<Paper> queue = new LinkedList<>();

            for(int i = 0; i < n; i++){
                queue.add(new Paper(i, Integer.parseInt(st.nextToken())));
            }

            Paper find = queue.get(a);

            int answer = 0;
            while(!queue.isEmpty()){
                Paper cur = queue.poll();
                boolean isMax = true;
                for(int i = 0; i < queue.size(); i++){
                    if(cur.weight < queue.get(i).weight){
                        queue.offer(cur);
                        for(int j = 0; j < i; j++){
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }
                if(!isMax){
                    continue;
                }

                answer++;
                if(cur.idx == a){
                    break;
                }
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb);

    }
}
