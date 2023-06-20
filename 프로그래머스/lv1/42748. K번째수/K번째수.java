import java.util.*;
class Solution {
    public static int re_array(int[] arr, int[] standard){
        int ans = -1;
        int [] sub = Arrays.copyOfRange(arr, standard[0] -1, standard[1]);
        Arrays.sort(sub);
        ans = sub[standard[2] -1];

        return ans;
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            answer[i] = re_array(array, commands[i]);
        }
        return answer;
    }
}