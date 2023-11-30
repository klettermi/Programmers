import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
    static int m, n, answer = -1;
    static int[][] board;
    static boolean[][] ch;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<Point> q = new LinkedList<>();

    private static void BFS(){
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Point cur = q.poll();
                for(int j = 0; j < 4; j++){
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                        if(!ch[nx][ny] && board[nx][ny] == 0){
                            ch[nx][ny] = true;
                            board[nx][ny] = 1;
                            q.offer(new Point(nx, ny));
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

        board = new int[n][m];
        ch = new boolean[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 1){
                    q.offer(new Point(i, j));
                    ch[i][j] = true;
                }
                if(board[i][j] == -1){
                    ch[i][j] = true;
                }
            }
        }
        BFS();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 0) answer = -1;
            }
        }

        System.out.println(answer);
    }
}
