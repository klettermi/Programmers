import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] a;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        a = new int[N];
        int idx = 0;
        int minV = Integer.MAX_VALUE, maxV = Integer.MIN_VALUE;

        // 비용은 한 줄에 여러 개가 오거나(공백 구분) N줄로 올 수 있으므로 토큰이 끝날 때까지 읽기
        while (idx < N) {
            String line = br.readLine();
            if (line == null) break;
            if (line.isEmpty()) continue;
            st = new StringTokenizer(line);
            while (st.hasMoreTokens() && idx < N) {
                int v = Integer.parseInt(st.nextToken());
                a[idx++] = v;
                if (v < minV) minV = v;
                if (v > maxV) maxV = v;
            }
        }

        // 이진 탐색: 가능한 최소 최대비용
        int lo = minV, hi = maxV;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (ok(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(lo);
    }

    // 최대 허용 비용이 limit일 때 모든 연속 K개 구간에 '수락(비용<=limit)'이 최소 1개 존재 가능한가?
    // == 비용>limit인 원소들의 연속 구간 길이가 K 이상인 곳이 있으면 불가능
    static boolean ok(int limit) {
        int badRun = 0; // 현재 '비용 > limit'가 연속된 길이
        for (int v : a) {
            if (v > limit) {
                badRun++;
                if (badRun >= K) return false; // 연속 K개 이상 거절해야 하므로 조건 위배
            } else {
                badRun = 0; // 하나 수락하면 연속 거절 끊김
            }
        }
        return true;
    }
}
