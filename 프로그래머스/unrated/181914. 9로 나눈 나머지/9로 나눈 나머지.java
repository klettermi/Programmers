class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] str = number.split("");
        int sum = 0;
        
        for(String s: str){
            sum += Integer.valueOf(s);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}