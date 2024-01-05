import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static Queue<Integer> q = new LinkedList<>();
    static int[] visit = new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        q.add(n);
        visit[n] = 1;
        System.out.println(BFS());
    }

    private static int BFS(){
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int p = q.poll();
                if(p == k) return visit[p]-1;
                if(p-1>=0 && visit[p - 1] == 0){
                    visit[p-1] = visit[p] + 1;
                    q.add(p-1);
                }
                if(p+1 <= 100000 && visit[p+1] == 0){
                    visit[p+1] = visit[p] + 1;
                    q.add(p+1);
                }
                if(2 * p <= 100000 && visit[2*p] == 0){
                    visit[2 * p] = visit[p] + 1;
                    q.add(2 * p);
                }
            }
        }
        return -1;
    }
}
