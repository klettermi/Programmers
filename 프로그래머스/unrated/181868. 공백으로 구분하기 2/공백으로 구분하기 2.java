import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] ans = my_string.trim().split(" ");
        ArrayList <String> str = new ArrayList <String> ();
        for(String s : ans){
            if(!s.equals("")){
                str.add(s);
            }
        }
        String[] answer = new String[str.size()];
        for(int i = 0; i < str.size(); i++)
            answer[i] = str.get(i);
        return answer;
    }
}