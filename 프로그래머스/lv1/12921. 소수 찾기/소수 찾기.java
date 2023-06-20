class Solution {
    public static boolean[] prime = new boolean[1000001];
    // 소수 판별
    public  void setPrime(){
        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i] == true) continue;
            for(int j = i * i; j < prime.length; j += i)
                prime[j] = true;
        }
    }
    public  int solution(int n) {
        int answer = 0;
        setPrime();
        for(int i = 1; i <= n; i++){
            if(prime[i] == false)
                answer++;
        }
        return answer;
    }
}