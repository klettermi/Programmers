import java.util.ArrayList;
class Solution {
    public int func(int[] arr, int[] query){
        ArrayList <Integer> num_arr = new ArrayList <Integer> ();

        for(int i = query[0]; i <= query[1]; i++){
            if(arr[i] > query[2]){
                num_arr.add(arr[i]);
            }
        }
        int min = -1;

        if(num_arr.size() != 0) {
            min = num_arr.get(0);

            for (int i : num_arr) {
                if (i < min)
                    min = i;
            }
        }
        
        return min;
    }
    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        for(int i = 0; i < queries.length; i++){
            answer[i] = func(arr, queries[i]);
        }
        return answer;
    }
}