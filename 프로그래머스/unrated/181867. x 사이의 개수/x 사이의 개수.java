import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList <String> ans = new ArrayList <String>();
        if(myString.endsWith("x")){
           for(String s : arr){
               ans.add(s);
           }
            ans.add("");
        }else{
            for(String s : arr)
                ans.add(s);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i).length();
        return answer;
    }
}