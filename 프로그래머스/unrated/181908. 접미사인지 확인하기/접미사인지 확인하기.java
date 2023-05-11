import java.util.*;
class Solution {
    public String[] func(String my_string) {
        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i < my_string.length(); i++){
            ans.add(my_string.substring(i, my_string.length()));
        }
        String[] answer = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(String s : func(my_string)){
            if(is_suffix.equals(s)){
                answer = 1;
                break;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}