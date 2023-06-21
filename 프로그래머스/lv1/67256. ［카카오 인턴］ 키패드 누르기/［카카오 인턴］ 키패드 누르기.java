import java.util.*;
class Solution {
    static int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, 10}}; // *: -1, #: 10

    // 해당 값의 인덱스 위치 찾기
    public static int[] getIndex(int a){
        int[] coordinate = new int[2];
        for(int i = 0; i < keypad.length; i++){
            for(int j = 0; j < keypad[i].length; j++){
                if(a == keypad[i][j]){
                    coordinate[0] = i;
                    coordinate[1] = j;
                }
            }
        }
        return coordinate;
    }
    // a에서 b로 갈 때 거리를 구하는 메소드
    public static int getDistance(int a, int b){
        int distance = 0;
        int[] a_p = getIndex(a);
        int[] b_p = getIndex(b);

        distance = Math.abs(a_p[0] - b_p[0]) + Math.abs(a_p[1] - b_p[1]);
        return distance;
    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        List<Integer> left_ls =  Arrays.asList(1, 4, 7);
        List<Integer> right_ls = Arrays.asList(3, 6, 9);

        int left_pos = -1; // 왼손 위치
        int right_pos = 10; // 오른손 위치
        int cnt = 0;
        for(int i : numbers){
            if(left_ls.contains(i)){
                answer += "L";
                left_pos = i;
            }else if(right_ls.contains(i)){
                answer += "R";
                right_pos = i;
            }else{
                // 거리가 같을 때
                if(getDistance(left_pos, i) == getDistance(right_pos, i)){
                    if(hand.equals("right")) {
                        answer += "R";
                        right_pos = i;
                    }
                    else {
                        answer += "L";
                        left_pos = i;
                    }
                }
                // 길이가 다를 때
                else  if(getDistance(left_pos, i) > getDistance(right_pos, i)) {
                        answer += "R";
                        right_pos = i;
                    }
                else {
                    answer += "L";
                    left_pos = i;
                }

            }
        }
        return answer;
    }
}