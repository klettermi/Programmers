import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList <Integer> ans = new ArrayList <Integer>();
        for(int i = 0; i < intStrs.length; i++){
            String str = intStrs[i].substring(s, s+l);
            if(Integer.valueOf(str) > k)
                ans.add(Integer.valueOf(str));           
        }
        
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}