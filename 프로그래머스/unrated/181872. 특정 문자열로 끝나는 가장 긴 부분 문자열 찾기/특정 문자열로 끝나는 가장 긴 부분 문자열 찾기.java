class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        String[] str = myString.split("");
        for(int i = 0; i < idx + pat.length(); i++)
            answer += str[i];
        return answer;
    }
}