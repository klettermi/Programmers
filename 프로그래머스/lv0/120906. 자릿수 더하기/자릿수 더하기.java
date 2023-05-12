class Solution {
    public int solution(int n) {
        int answer = 0;
        String sub = "" + n;
        String[] ans = sub.split("");
        for(String s : ans){
            answer += Integer.valueOf(s);
        }
        return answer;
    }
}