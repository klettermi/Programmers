import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList <Integer> ans = new ArrayList <Integer> ();
        for(int i = n; i < num_list.length; i++)
            ans.add(num_list[i]);
        
        for(int i = 0; i < n; i++)
            ans.add(num_list[i]);
        
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}