import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        ArrayList <String> ans = new ArrayList <String>();
        for(int i = 0; i < strArr.length; i++){
            String add = (i % 2 == 0)? strArr[i].toLowerCase() : strArr[i].toUpperCase();
            ans.add(add);
        }
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = ans.get(i);
        return answer;
    }
}