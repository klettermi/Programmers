class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] str = my_string.split("");
        String reverse = "";
        for(int i = e; i >= s; i--){
            reverse += str[i];
        }
        
        for(int i = 0; i < s; i++)
            answer += str[i];
        answer += reverse;
        for(int i = e+1; i < str.length; i++)
            answer += str[i];
        return answer;
    }
}