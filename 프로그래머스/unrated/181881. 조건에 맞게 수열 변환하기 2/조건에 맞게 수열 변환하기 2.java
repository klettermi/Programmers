import java.util.*;
class Solution {
    public int[] arr_func(int[] arr_f){
        int[] answer = new int[arr_f.length];
        for(int i = 0; i < arr_f.length; i++){
            if((arr_f[i] >= 50) && (arr_f[i] % 2 == 0))
                answer[i] = arr_f[i] / 2;
            else if((arr_f[i] < 50) && (arr_f[i] % 2 == 1))
                answer[i] = arr_f[i] * 2 + 1;
        }

        return answer;
    }
    public int solution(int[] arr) {
        int answer = 0;
        int x = 0;
        while(true){
            if(Arrays.equals(arr_func(arr), arr_func(arr_func(arr)))){
                answer = x;
                break;
            }
            x++;
            arr = Arrays.copyOf(arr_func(arr), arr_func(arr).length);
        }
        return answer;
    }
}