class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int start = 0;
        String str = "";
        while(true){
            str = myString.substring(start);
            if(str.indexOf(pat) != -1){
                answer++;
                start += str.indexOf(pat) + 1;
            }else{
                break;
            }
            
        }
        return answer;
    }
}