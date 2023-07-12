class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long[] d = new long[n+1];
        
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        
        d[0] = 0;
        d[1] = 1L;
        d[2] = 2L;
        
        for(int i = 3; i <= n; i++){
            d[i] = (d[i-1] + d[i-2]) % 1234567;
        }
        
        answer = (int) d[n];
        return answer;
    }
}