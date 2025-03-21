import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerArray = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
            if (progresses[i] % speeds[i] != 0) progresses[i] = progresses[i] / speeds[i] + 1;
            else progresses[i] = progresses[i] / speeds[i];
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int progress : progresses) {
            queue.add(progress);
        }
        

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }

            answerArray.add(count);
        }

        
        int[] answer = new int[answerArray.size()];
        answer = answerArray.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}