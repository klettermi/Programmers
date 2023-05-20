import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> ans = new ArrayList <Integer>();
        for(int i : arr){
            for(int j = 0; j < i; j++)
                ans.add(i);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}