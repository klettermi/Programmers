import java.util.Scanner;

public class Main {
    static boolean[][] board, visited;
    static int[] d = {-1, 1};
    static int n, m, answer = 0;
    private static void DFS(int x, int y){
        visited[x][y] = true;
        if(!board[x][y]){
            for(int i = 0; i < 2; i++){
                int nx = x + d[i];
                if(nx >= 0 && nx < n && !visited[nx][y] && !board[nx][y]){
                    visited[nx][y] = true;
                    DFS(nx, y);
                }
            }
        }
        else{
            for(int i = 0; i < 2; i++){
                int ny = y + d[i];
                if(ny >= 0 && ny < m && !visited[x][ny] && board[x][ny]){
                    visited[x][ny] = true;
                    DFS(x, ny);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new boolean[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String[] strs = sc.next().split("");
            for(int j = 0; j < m; j++){
                String str = strs[j];
                if(str.equals("-")) board[i][j] = true;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j]){
                    DFS(i, j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
