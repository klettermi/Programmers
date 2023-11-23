import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[][] apart;
    static boolean[][] check;
    static int n, cnt, complex = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<Integer> apartCount = new ArrayList<>();

    private static void dfs(int x, int y){
        check[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                if(!check[nx][ny] && apart[nx][ny] == 1){
                    cnt++;
                    dfs(nx, ny);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        n = Integer.parseInt(br.readLine());
        apart = new int[n][n];
        check = new boolean[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            for(int j = 0; j < n; j++){
                apart[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!check[i][j] && apart[i][j] == 1){
                    cnt = 1;
                    dfs(i, j);
                    complex++;
                    apartCount.add(cnt);
                }
            }
        }
        Collections.sort(apartCount);
        sb.append(complex).append("\n");
        for(int i = 0; i < apartCount.size(); i++){
            sb.append(apartCount.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
