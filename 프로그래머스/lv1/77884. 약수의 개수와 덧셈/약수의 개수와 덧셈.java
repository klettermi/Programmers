class Solution {
    public int measure(int n){
        int m_cnt = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                m_cnt++;
        }
        return m_cnt;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            if(measure(i) % 2 == 0)
                answer += i;
            else answer -= i;
        }
        return answer;
    }
}