import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class Main {
    static int[][][] board;
    static int m, n, h, answer = -1;
    static Queue<Point> q = new LinkedList<>();
    static boolean[][][] ch;
    static int[] dx = {-1, 0, 1, 0, 0, 0};
    static int[] dy = {0, -1, 0, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    private static void BFS(){
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Point cur = q.poll();
                for(int j = 0; j < 6; j++){
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];
                    int nz = cur.z + dz[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && nz >=0 && nz <h){
                        if(!ch[nx][ny][nz] && board[nx][ny][nz] == 0){
                            ch[nx][ny][nz] = true;
                            board[nx][ny][nz] = 1;
                            q.offer(new Point(nx, ny, nz));
                        }
                    }
                }
            }
            answer++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         m = Integer.parseInt(st.nextToken());
         n = Integer.parseInt(st.nextToken());
         h = Integer.parseInt(st.nextToken());

         board = new int[n][m][h];
         ch = new boolean[n][m][h];

         for(int i = 0; i < h; i++){
             for(int j = 0; j < n; j++){
                 st = new StringTokenizer(br.readLine());
                 for(int k = 0; k < m; k++){
                     board[j][k][i] = Integer.parseInt(st.nextToken());
                 }
             }
         }

         for(int i = 0; i < h; i++){
             for(int j = 0; j < n; j++){
                 for(int k = 0; k < m; k++){
                     if(board[j][k][i] == 1){
                         q.add(new Point(j, k, i));
                         ch[j][k][i] = true;
                     }
                     if(board[j][k][i] == -1) ch[j][k][i] = true;
                 }
             }
         }

         BFS();

        for(int i = 0; i < h; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    if(board[j][k][i] == 0) answer = -1;
                }
            }
        }
        System.out.println(answer);
    }
}
