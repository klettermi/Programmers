import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> stk = new ArrayList <Integer>();
        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            }else{
                stk.add(arr[i]);
                i++;
            }
        }
        
        if(stk.isEmpty())
            stk.add(-1);
        
        int[] answer = new int[stk.size()];
        for(int j = 0; j < stk.size(); j++)
            answer[j] = stk.get(j);
        return answer;
    }
}