import java.util.*;
class Solution {
public String solution(int[] food) {
        String answer = "";
        LinkedList<String> li = new LinkedList<>();
        for(int i = 0; i < food.length; i++){
            for(int j = 1; j <= food[i]/2; j++){
                li.add((i) + "");
            }
        }
        for(int i = 0; i < li.size(); i++){
            answer += li.get(i);
        }
        answer += "0";
        for(int i = li.size()-1; i >= 0; i--){
            answer += li.get(i);
        }
        return answer;
    }
}