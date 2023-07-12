import java.util.*;
class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(!map.keySet().contains(s.charAt(i))){
                map.put(s.charAt(i), i);
                answer[i] = -1;
            }else{
                answer[i] = i - map.get(s.charAt(i));
                map.replace(s.charAt(i), i);
            }
        }
        return answer;
    }
}