class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = start + m - 1;
        
        for (int i : section) {
            if (i > end) {
                end = i + m - 1;
                answer++;
            }
        }
        return answer;
    }
}