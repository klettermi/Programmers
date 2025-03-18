class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int countDivisor = countDivisors(i);
            if (countDivisor > limit) answer += power;
            else answer += countDivisor;
        }
        
        
        return answer;
    }
    
    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if(n%i == 0){
                count++;
                if(i != n/i) count++;
            }
        }
        return count;
    }
}