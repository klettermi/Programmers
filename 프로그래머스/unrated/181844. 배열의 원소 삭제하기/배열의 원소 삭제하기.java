import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList <Integer> ans = new ArrayList <Integer> ();
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                ans.add(arr[i]);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
                answer[i] = ans.get(i);
        
        return answer;
    }
}