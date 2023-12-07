import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String[][] board;
    static boolean[][] ch, ch2;
    static int n, answer1 = 0, answer2 = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    private static void DFS1(int x, int y, String s){
        ch[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                if(!ch[nx][ny] && board[nx][ny].equals(s)){
                    ch[nx][ny] = true;
                    DFS1(nx, ny, board[nx][ny]);
                }
            }
        }
    }

    private static void DFS2(int x, int y, String s){
        ch2[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                if(!ch2[nx][ny]){
                    if(s.equals("R")||s.equals("G")){
                        if(board[nx][ny].equals("G") || board[nx][ny].equals("R")){
                            ch2[nx][ny] = true;
                            DFS2(nx, ny, board[nx][ny]);
                        }
                    }else if(board[nx][ny].equals(s)){
                        ch2[nx][ny] = true;
                        DFS2(nx, ny, board[nx][ny]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new String[n][n];
        ch = new boolean[n][n];
        ch2 = new boolean[n][n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            for(int j = 0; j < n; j++){
                board[i][j] = str[j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!ch[i][j]){
                    DFS1(i, j, board[i][j]);
                    answer1++;
                }
                if(!ch2[i][j]){
                    DFS2(i, j, board[i][j]);
                    answer2++;
                }
            }
        }


        System.out.println(answer1 + " " + answer2);
    }
}
