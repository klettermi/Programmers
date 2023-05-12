class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");
        for(String s : str){
            try{
                answer += Integer.valueOf(s);
             }catch(NumberFormatException e){
                answer += 0;
            }
        }
        return answer;
    }
}