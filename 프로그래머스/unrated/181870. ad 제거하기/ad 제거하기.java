import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList <String> str = new ArrayList <String>();
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].indexOf("ad") == -1)
                str.add(strArr[i]);
        }
        
        String[] answer = new String[str.size()];
        for(int i = 0; i < str.size(); i++)
            answer[i] = str.get(i);
        return answer;
    }
}