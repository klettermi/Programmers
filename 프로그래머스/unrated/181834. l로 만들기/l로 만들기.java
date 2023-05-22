class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(Integer.valueOf(myString.charAt(i)) < Integer.valueOf('l'))
                answer += "l";
            else
                answer += myString.charAt(i);
        }
        return answer;
    }
}