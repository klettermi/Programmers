import java.util.ArrayList;
class Solution {
    public int[] func(int[] arr, int[] query){
        for(int i = query[0]; i <= query[1]; i++){
            if(i % query[2] == 0){
                arr[i] = arr[i] + 1;
            }
        }
        return arr;
    }
    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < queries.length; i++){
            func(arr, queries[i]);
        }
        answer = arr;
        return answer;
    }
}