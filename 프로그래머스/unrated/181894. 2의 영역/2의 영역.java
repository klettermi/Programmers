import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> idx = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
                idx.add(i);
        }

        if (idx.isEmpty()) {
            ans.add(-1);
        } else {
            Collections.sort(idx);

            for (int i = idx.get(0); i <= idx.get(idx.size() - 1); i++)
                ans.add(arr[i]);
        }

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}