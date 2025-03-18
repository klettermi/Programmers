import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 'want'와 'number'를 map 형태로 변환
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 슬라이딩 윈도우 방식으로 10일 간의 할인 품목 체크
        Map<String, Integer> windowMap = new HashMap<>();
        
        // 처음 10일을 윈도우로 설정
        for (int i = 0; i < 10; i++) {
            windowMap.put(discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }
        
        // 할인 목록을 슬라이드하면서 확인
        for (int i = 0; i <= discount.length - 10; i++) {
            // 조건을 만족하는지 체크
            if (isValidWindow(wantMap, windowMap)) {
                answer++;
            }
            
            // 윈도우 슬라이드: 첫 번째 항목을 제거하고, 새로운 항목을 추가
            if (i + 10 < discount.length) {
                // 이전 할인 항목 제거
                String removed = discount[i];
                windowMap.put(removed, windowMap.get(removed) - 1);
                if (windowMap.get(removed) == 0) {
                    windowMap.remove(removed);
                }
                
                // 새 할인 항목 추가
                String added = discount[i + 10];
                windowMap.put(added, windowMap.getOrDefault(added, 0) + 1);
            }
        }

        return answer;
    }

    // 현재 윈도우가 'want'에 맞는지 체크하는 함수
    private boolean isValidWindow(Map<String, Integer> wantMap, Map<String, Integer> windowMap) {
        for (Map.Entry<String, Integer> entry : wantMap.entrySet()) {
            String product = entry.getKey();
            int requiredQuantity = entry.getValue();
            int availableQuantity = windowMap.getOrDefault(product, 0);
            if (availableQuantity != requiredQuantity) {
                return false;
            }
        }
        return true;
    }
}
