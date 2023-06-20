class Solution {
    public int solution(int n) {
        int answer = 0;
        // n - 1의 1이 아닌 가장 작은 약수를 구하면 됨
        int m = n - 1;
        for(int i = 2; i <= m; i++){
            if(m % i == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}