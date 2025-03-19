import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0; // 가능한 회원가입 날짜 개수
        int n = discount.length;
        int windowSize = 10; // 윈도우 크기 (10일)

        // 정현이가 원하는 제품 목록을 Map으로 저장
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 현재 윈도우의 상품 개수를 저장할 Map
        HashMap<String, Integer> currentWindow = new HashMap<>();

        // 초기 윈도우 (첫 10일) 설정
        for (int i = 0; i < Math.min(windowSize, n); i++) {
            currentWindow.put(discount[i], currentWindow.getOrDefault(discount[i], 0) + 1);
        }

        // 첫 윈도우가 조건을 만족하는지 체크
        if (isMatch(wantMap, currentWindow)) count++;

        // 윈도우 슬라이딩 시작 (하루씩 이동)
        for (int i = 1; i <= n - windowSize; i++) {
            String removeItem = discount[i - 1]; // 이전 윈도우의 첫 번째 상품 제거
            currentWindow.put(removeItem, currentWindow.get(removeItem) - 1);
            if (currentWindow.get(removeItem) == 0) {
                currentWindow.remove(removeItem);
            }

            String addItem = discount[i + windowSize - 1]; // 새로운 상품 추가
            currentWindow.put(addItem, currentWindow.getOrDefault(addItem, 0) + 1);

            // 현재 윈도우가 정현이의 조건을 만족하는지 확인
            if (isMatch(wantMap, currentWindow)) count++;
        }

        return count;
    }

    // 두 개의 Map이 동일한지 비교하는 메서드
    private boolean isMatch(HashMap<String, Integer> wantMap, HashMap<String, Integer> currentWindow) {
        for (String key : wantMap.keySet()) {
            if (currentWindow.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}
