import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(tangerine);
        for(int i = 0; i < tangerine.length; i++){
            if(map.containsKey(tangerine[i])){
                map.replace(tangerine[i], map.get(tangerine[i])+1);
            }else{
                map.put(tangerine[i], 1);
            }
        }
        int[] lis = new int[map.size()];
        Iterator<Integer> iter = map.keySet().iterator();
        for(int i = 0; i < map.size(); i++){
            int key = iter.next();
            lis[i] = map.get(key);
        }
        Arrays.sort(lis);
        int sum = 0;
        for(int i = lis.length-1; i >= 0; i--){
            answer++;
            sum += lis[i];
            if(sum >= k){
                break;
            }
        }
        return answer;
    }
}