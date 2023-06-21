import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public static HashMap<Integer, Integer> makeHash(int[] nums){
        HashMap<Integer, Integer> pocket = new HashMap<>();
        HashSet <Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i : set){
            int cnt = 0;
            for(int j : nums){
                if(i == j)
                    cnt++;
            }
            pocket.put(i, cnt);
        }
        return pocket;
    }
    public static int solution(int[] nums) {
        int answer = 0;
        HashMap <Integer, Integer> pocket = makeHash(nums);
        if(pocket.size() <= nums.length/2) answer = pocket.size();
        else answer = nums.length/2;
        return answer;
    }
}