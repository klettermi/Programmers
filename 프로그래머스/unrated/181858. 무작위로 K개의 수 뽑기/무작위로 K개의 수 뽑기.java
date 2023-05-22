import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList <Integer> sub = new ArrayList <Integer>();
        sub.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            boolean flag = false;
            for(int j : sub){
                if(arr[i] == j)
                    flag = true;
            }
            if(!flag){
                sub.add(arr[i]);
            }
        }
        
        if(k > sub.size()){
            for(int i = 0; i < sub.size(); i++)
                answer[i] = sub.get(i);
            for(int i = sub.size(); i < k; i++)
                answer[i] = -1;
        }else{
            for(int i = 0; i < k; i++)
                answer[i] = sub.get(i);
        }
        return answer;
    }
}