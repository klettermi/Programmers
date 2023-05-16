import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList <String> ans = new ArrayList <String> ();
        
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0)
                ans.add(names[i]);
        }
        
        String[] answer = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        
        return answer;
    }
}