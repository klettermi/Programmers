import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 양옆앞뒤 큰 수 찾기
 * 5 x 5 2차원 배열
 * 어떤 원소가 상하좌우에 있는 원소보다 클 때 해당 위치에 *을 표시
 * 상하좌우 중 존재하는 원소만을 비교
 */
public class EX3 {
    public int solution1(int[] F) {
        int answer = 0;
        Set<Integer> list = new HashSet<>();
        for(int i = 1; i <= F.length; i++){
            list.add(i);
        }
        for(int i = 0; i < F.length; i++){
            if(list.contains(F[i])){
                list.remove(F[i]);
            }else{
                return answer;
            }
        }
        return 1;
    }

    public int solution2(int N, int[] F, int[] B) {
        int answer = -1;
        if(solution1(B) == 0) return -1;
        int first = B[0];
        boolean flag = false;

        for(int i = 0; i < N; i++){
            if(F[i] == first){
                for(int j = 0; j < B.length; j++){
                    if(N-i < B.length) return -1;
                    if(F[i+j] != B[j]){
                        flag = false;
                        break;
                    }else {
                        answer = i + 1;
                        flag = true;
                    }
                }
                if(flag){
                    return answer;
                }
            }
        }
        return answer;
    }

    public int solution(int N, int[] F, int[] S, int[] B, int T) {
        int answer = 0;
        // 일단 오는지 멈췄는지 멀어지는지 확인해야함.
        int p = T;
        int q = 0;
        // 일단 멈췄다면
        for(int i = 0; i < F.length; i++){
            if(F[i] != S[i]){
                break;
            }else{
                return 0;
            }
        }

        // 멀어지는지 오는지 확인
        if(S[0] == 0){
            for(int i = 0; i < S.length; i++){
                if(S[i] != 0){
                    q = -i;
                    break;
                }
            }
        }else if(S[S.length-1] == 0){
            for(int i = S.length-1; i >= 0; i--){
                if(S[i] != 0){
                    q = i;
                    break;
                }
            }
        }

        if(q<0){
            answer = q * 60 - p;
        }else {
            answer = q * 60 + p;
        }

        return answer;
    }

    public static void main(String[] args) {
        EX3 method = new EX3();
        int N = 10;
        int[] F = {1,2,3,4,5,6,7,8,9,10};
        int[] S =  {0,0,1,2,3,4,5,6,7,8};
        int[] B = {1,2,3,4,5,6,7,8};
        int T = 7;
        System.out.println(method.solution(N, F, S, B, T));
    }
}
