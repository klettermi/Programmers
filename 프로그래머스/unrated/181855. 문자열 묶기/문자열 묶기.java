import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] len = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            len[i] = strArr[i].length();
        }
        ArrayList <Integer> lis = new ArrayList <Integer>();
        lis.add(len[0]);
    
        for(int i : len){
            boolean flag = false;
            for(int j : lis){
                if(i==j)
                    flag = true;
            }
            if(!flag)
                lis.add(i);
        }
        
        int[] sum = new int[lis.size()];
        for(int i : len){
            for(int j = 0; j < lis.size(); j++){
                if(i == lis.get(j))
                    sum[j]++;
            }
        }
        int answer = sum[0];
        for(int i = 1; i < sum.length; i++){
            if(answer < sum[i])
                answer = sum[i];
        }
        return answer;
    }
}