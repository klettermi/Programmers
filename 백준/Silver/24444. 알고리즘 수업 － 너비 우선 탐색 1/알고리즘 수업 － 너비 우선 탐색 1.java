import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static private ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] check;
    static int cnt;

    private static void bfs(int node){
        check[node] = cnt;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for(int nv : graph.get(cv)){
                if(check[nv] == 0){
                    queue.offer(nv);
                    cnt++;
                    check[nv] = cnt;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        check = new int[n+1];
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i < graph.size(); i++){
            Collections.sort(graph.get(i));
        }
        cnt = 1;
        bfs(r);
        for(int i = 1; i < check.length; i++){
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);
    }
}
