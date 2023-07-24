import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        LinkedList<Integer> lis = new LinkedList<>();
        LinkedList<Integer> ans = new LinkedList<>();
        lis.add(score[0]);
        ans.add(score[0]);
        for(int i = 1; i < score.length; i++){
            if(lis.size() < k){
                lis.add(score[i]);
            }else{
                if(lis.peek() < score[i]){
                    lis.pop();
                    lis.add(score[i]);
                }
            }
            Collections.sort(lis);
            ans.add(lis.peek());
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }

        return answer;
    }
}