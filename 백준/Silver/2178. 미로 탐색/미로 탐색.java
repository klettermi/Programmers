import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int[][] distinct;
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> q = new LinkedList<>();

    public static class Point{
        int x, y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    private static void bfs(int x, int y){
        while(!q.isEmpty()){
            Point p = q.poll();
            for(int i = 0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(distinct[nx][ny] == -1 && arr[nx][ny] == 1){
                        q.offer(new Point(nx, ny));
                        distinct[nx][ny] = distinct[p.x][p.y] + 1;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        distinct = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(str[j]);
                distinct[i][j] = -1;
            }
        }
        distinct[0][0] = 0;
        q.offer(new Point(0,0));
        bfs(0, 0);
        System.out.println(distinct[n-1][m-1] + 1);
    }
}
