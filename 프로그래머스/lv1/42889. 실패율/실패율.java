import java.util.*;
class Solution {
     public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        int peopleCnt = stages.length; // 전체 사람 수
        HashMap <Integer, Double> failMap = new HashMap<>();

        // 스테이지 통과 못한 사람 수 구하는 부분
        for(int i = 0; i < N; i++) {
            int cnt = 0;
            int fail = 0;
            for(int j : stages){
                if(j == (i+1))
                    cnt++;
            }
            fail = cnt;
            // 실패율 만들기
            double failPercent = 0.0;
            if(peopleCnt != 0){
                failPercent = (double)fail / peopleCnt;
            }

            peopleCnt -= fail;
            // HashMap <스테이지, 실패율> 만들기
            failMap.put(i+1, failPercent);
            System.out.println(i+1 +"번 실패율: " + failPercent + ", 남은 사람 수: " + peopleCnt);
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(failMap.entrySet());
        // 비교함수 Comparator를 사용하여 내림차순 정렬
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                // 내림차순 정렬
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int i = 0;
        for (Map.Entry<Integer, Double> entrySet : list) {
            answer[i] = entrySet.getKey();
            i++;
        }

        return answer;
    }
}