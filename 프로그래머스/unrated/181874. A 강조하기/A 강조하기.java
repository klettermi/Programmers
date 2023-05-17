class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] ans = myString.split("");
        
        for(String s : ans){
            if(s.equals("a"))
                answer += "A";
            else if(!s.equals("A"))
                answer += s.toLowerCase();
            else
                answer += s;
        }
        return answer;
    }
}