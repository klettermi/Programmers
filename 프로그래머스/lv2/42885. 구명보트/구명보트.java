import java.util.*;
class Solution {
public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        Deque<Integer> list = new ArrayDeque<>();

        for(int i = people.length-1; i >= 0; i--){
            list.add(people[i]);
        }

        while(!list.isEmpty()){
            int sum = list.getFirst() + list.getLast();
            if(sum <= limit){
                list.pollFirst();
                list.pollLast();
                answer++;
            }else{
                list.pollFirst();
                answer++;
            }
        }
        
        return answer;
    }
}