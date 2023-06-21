import java.util.Arrays;
class Solution {
   public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){ //도난 당한 학생 == 여벌옷 가져온 학생
                    lost[i] = reserve[j] = -1; //-1로 초기화
                    answer++;
                    break;
                }
            }
        }

        for(int i : lost){
            for(int j = 0; j < reserve.length; j++){
                if(i == reserve[j] - 1 || i == reserve[j] + 1){
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;

    }
}