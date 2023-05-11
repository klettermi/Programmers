class Solution {
    public String func(String my_str, int[] part){
        String ans = my_str.substring(part[0], part[1]+1);
        return ans;
    }
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){
            answer += func(my_strings[i], parts[i]);
        }
        return answer;
    }
}