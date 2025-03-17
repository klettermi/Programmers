import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        // 각 의상 종류별 개수를 저장
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int combinations = 1;

        // 각 의상 종류별 (해당 의상 개수 + 1)을 곱함 (입지 않는 경우 포함)
        for (int count : map.values()) {
            combinations *= (count + 1);
        }

        // 모든 의상을 안 입는 경우(1가지) 제외
        return combinations - 1;
    }
}
