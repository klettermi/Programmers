import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int[][] graph;
    static int[] ch;
    static int n, m, a, b, answer = 0;
    static Queue<Point> q = new LinkedList<>();

    private static boolean BFS(){
        while(!q.isEmpty()){
            int size = q.size();
            for(int k = 0; k < size; k++){
                Point tmp = q.poll();
                if(tmp.y == b) {
                    answer++;
                    return true;
                }
                ch[tmp.x] = 1;
                for(int i = 1; i <= n; i++){
                    if(ch[i] == 0 && graph[tmp.y][i] == 1){
                        q.offer(new Point(tmp.y, i));
                    }
                }
            }
            answer++;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        for(int i = 1; i <= n; i++){
            if(graph[a][i] == 1) q.offer(new Point(a, i));
        }

        if(BFS()) System.out.println(answer);
        else System.out.println(-1);
    }
}
