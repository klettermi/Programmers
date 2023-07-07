import static java.lang.Long.toBinaryString;
class Solution {
    public int solution(int n) {
        int answer = n;
        while(true){
            answer++;
            if(one(n) == one(answer)) return answer;
        }
    }
    
    public int one(int n){
        int ans = 0;
        String s = toBinaryString(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                ans++;
        }
        return ans;
    }
}