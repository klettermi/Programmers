import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList <String> ans = new ArrayList <String> ();
        for(int i = 0; i < finished.length; i++){
            if(!finished[i])
                ans.add(todo_list[i]);
        }
        
        String[] answer = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        
        return answer;
    }
}