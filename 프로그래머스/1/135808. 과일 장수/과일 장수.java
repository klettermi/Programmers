import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 1. 배열을 리스트로 변환 후 내림차순 정렬
        List<Integer> array = new ArrayList<>();
        for (int s : score) {
            array.add(s);
        }
        array.sort(Collections.reverseOrder());

        // 2. m개의 박스를 만들 수 있는 만큼 반복
        for (int i = 0; i + m <= array.size(); i += m) {
            answer += array.get(i + m - 1) * m;  // 가장 작은 값 × m
        }

        return answer;
    }
}
