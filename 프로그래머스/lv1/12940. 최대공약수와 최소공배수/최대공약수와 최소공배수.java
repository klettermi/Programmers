class Solution {
    public static int gcd(int a, int b){
        int p = a > b? a : b;
        int q = a > b? b : a;
        if(q == 0) return p;
        return gcd(q, p % q);
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n, m);
        int gcm = gcd * (n / gcd) * (m / gcd);
        answer[0] = gcd;
        answer[1] = gcm;
        return answer;
    }
}