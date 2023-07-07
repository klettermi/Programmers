class Solution {
   public int solution(int n) {
        int answer = 0;
        String s = ternary_r(n);
        for(int i = 0 ; i < s.length(); i++){
            answer += Integer.valueOf(s.charAt(i)+"") * Math.pow(3, s.length()-i-1);
        }
        return answer;
    }

    public String ternary_r(int n){
        String ans = "";
        while(n > 0){
            ans += (n % 3);
            n /= 3;
        }
        return ans;
    }
}