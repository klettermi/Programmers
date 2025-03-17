import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String completePlayer : completion){
            map.put(completePlayer, map.get(completePlayer) - 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) return entry.getKey();
        }
        return answer;
    }
}