import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 작은 예산부터 지원을 해줘야 많이 지원 가능
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            if(budget - d[i] < 0) break;
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}