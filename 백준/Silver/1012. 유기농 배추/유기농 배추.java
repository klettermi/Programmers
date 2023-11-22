import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] ground;
    static boolean[][] check;
    static int m, n;

    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };
    private static void dfs(int x, int y){
        check[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < m && ny >= 0 && ny <n){
                if(!check[nx][ny] && ground[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int ts = 0; ts < t; ts++){
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            ground = new int[m][n];
            check = new boolean[m][n];
            for(int i = 0; i < k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;
            }

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(!check[i][j] && ground[i][j] == 1){
                        dfs(i, j);
                        answer++;
                    }

                }
            }

            System.out.println(answer);
        }
    }
}
