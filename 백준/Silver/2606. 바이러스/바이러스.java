import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] check;
    static int cnt;
    private static void dfs(int node){
        check[node] = 1;
        for(int i = 0; i < graph.get(node).size(); i++){
            int nv = graph.get(node).get(i);
            if(check[nv] == 0){
                cnt++;
                dfs(nv);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());

        check = new int[n+1];

        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < v; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        cnt = 0;
        dfs(1);
        System.out.println(cnt);
    }
}
