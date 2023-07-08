class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        String s = "";
        for(int i = 0; i < t.length() - len + 1; i++){
            if(t.substring(i).length() < len)
                return answer;
            s = t.substring(i, i + len);
            if(Long.parseLong(s) <= Long.parseLong(p))
                answer++;
        }
        return answer;
    }
}