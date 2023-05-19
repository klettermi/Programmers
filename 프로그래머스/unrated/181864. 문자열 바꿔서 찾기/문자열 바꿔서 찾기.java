class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String ans = "";
        String[] arr = myString.split("");
        for(String s : arr){
            if(s.equals("A"))
                ans += "B";
            else if(s.equals("B"))
                ans += "A";
        }
        if(ans.indexOf(pat) != -1)
            answer++;
        
        return answer;
    }
}