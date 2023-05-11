import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
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
}