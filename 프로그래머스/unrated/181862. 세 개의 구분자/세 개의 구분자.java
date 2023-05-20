import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] ans = myStr.split("a|b|c");
        ArrayList <String> a = new ArrayList <String> ();
        for(String s : ans){
          if(!s.equals(""))
              a.add(s);
        }
        if(a.isEmpty())
            a.add("EMPTY");
        String[] answer = new String[a.size()];
        for(int i = 0; i < a.size(); i++)
            answer[i] = a.get(i);
        return answer;
    }
}