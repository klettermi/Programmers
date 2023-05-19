import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        ArrayList <String> ans = new ArrayList <String>();
        for(String s : arr){
            if(!s.equals(""))
                ans.add(s);
        }
        String[] answer = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}