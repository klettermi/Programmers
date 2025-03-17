import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int getNum = nums.length / 2;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), getNum);
    }
}