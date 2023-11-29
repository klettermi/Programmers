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
    static int[][] board, ch;
    static Queue<Point> q = new LinkedList<>();
    static int ex, ey, a, answer = 0;
    static int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    static boolean flag;
    private static int BFS() {
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point tmp = q.poll();
                if (tmp.x == ex && tmp.y == ey) {
                    return answer;  // Return the distance instead of incrementing answer
                }
                for (int j = 0; j < 8; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (nx >= 0 && nx < a && ny >= 0 && ny < a && ch[nx][ny] == 0) {
                        ch[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
            answer++;  // Increment the distance after processing each level
        }
        return -1;  // If the destination is not reachable
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            flag = false;
            answer = 0;
            q.clear();
            a = Integer.parseInt(br.readLine());
            board = new int[a][a];
            ch = new int[a][a];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ex = Integer.parseInt(st.nextToken());
            ey = Integer.parseInt(st.nextToken());

            q.offer(new Point(sx, sy));
            ch[sx][sy] = 1;

            System.out.println(BFS());
        }
    }
}
