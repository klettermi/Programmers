import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int n = sc.nextInt();

        int[][] xy = new int[101][101];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    xy[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(xy[i][j] == 1) answer++;
            }
        }

        System.out.println(answer);
    }
}
