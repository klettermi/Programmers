import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    // 조합 구하기 메소드
    public static LinkedList<Integer> ans = new LinkedList<>();
    static void comb(int[] arr, boolean[] visited, int start, int n, int r){
        if (r == 0) {
            ans.add(sum(arr, visited));

        } else {
            for (int i = start; i < n; i++) {
                visited[i] = true; // 방문했으니까 true로 변경comb_cnt
                comb(arr, visited, i + 1, n, r - 1);
                visited[i] = false; // 방문했을 경우를 다 돌아서 방문하지 않을 경우로 셋팅
            }
        }
    }

    // 배열 생성 메소드
    static int sum(int[] arr, boolean[] visited){
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if (visited[i] == true) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st2.nextToken());

        boolean[] visited = new boolean[n];

        comb(arr, visited, 0, n, 3); // 추가
        int fin = ans.get(0);
        for(int i : ans){
            if(Math.abs(m-i) < Math.abs(m - fin) && i <= m){
                fin = i;
            }
        }
        System.out.println(fin);
    }
}
