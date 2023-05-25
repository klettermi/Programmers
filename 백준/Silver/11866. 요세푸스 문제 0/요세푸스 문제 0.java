import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 요세푸스 문제 0수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        LinkedList <Integer> cir = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int s_idx = s-1;

        for(int i = 1; i <= n; i++)
            cir.add(i);

        while(true){
            ans.add(cir.get(s_idx));
            cir.remove(s_idx);

            if(cir.isEmpty())
                break;

            s_idx += (s - 1);
            if(s_idx > cir.size()-1)
                s_idx = s_idx % cir.size();
        }

        sb.append("<");
        for(int i = 0; i < ans.size()-1; i++)
            sb.append(ans.get(i)).append(", ");
        sb.append(ans.get(ans.size()-1)).append(">");

        System.out.println(sb);
    }
}
