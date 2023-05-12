import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList <Integer> ans = new ArrayList <Integer>();
        String[] str = my_string.split("");
        for(String s : str){
            try{
                ans.add(Integer.valueOf(s));
             }catch(NumberFormatException e){
                
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        Arrays.sort(answer);
        return answer;
    }
}