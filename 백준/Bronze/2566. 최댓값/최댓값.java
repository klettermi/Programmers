import java.util.Scanner;

public class Main {
    public void solution(int[][] arr){
        StringBuffer sb = new StringBuffer();
        int max = Integer.MIN_VALUE;
        int mi = 0, mj = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    mi = i+1;
                    mj = j+1;
                }
            }
        }

        sb.append(max);
        sb.append("\n");
        sb.append(mi + " " + mj);
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        T.solution(arr);
    }
}
