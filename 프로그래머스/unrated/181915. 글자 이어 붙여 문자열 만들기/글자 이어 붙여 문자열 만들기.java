class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] my_str = my_string.split("");
        
        for(int i : index_list){
            answer += my_str[i];
        }
        return answer;
    }
}