class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(bill[0] >= 1 && bill[1] >= 1) {
            if((wallet[0] >= bill[0] && wallet[1] >= bill[1]) ||
              (wallet[0] >= bill[1] && wallet[1] >= bill[0])) return answer;
            else {
                answer++;
                if(bill[0] > bill[1]) bill[0] /= 2;
                else bill[1] /= 2;
            }
        }
        return answer;
    }
}