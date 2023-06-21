import java.util.Stack;
class Solution {
    // 꺼내는 함수
    public static int pick(int[][] board, int move){
        int pop = 0;
        for(int i = 0; i < board[0].length; i++){
            if(board[i][move-1] != 0){
                pop = board[i][move-1];
                board[i][move-1] = 0;
                break;
            }
        }

        return pop;
    }
    // stack에 넣었을 때 같으면 사라지고 사라진 인형 수 반환 메소드
    static Stack<Integer> doll = new Stack<>();
    static int dollCnt = 0;
    public static void popDoll(int dollName){
        if(dollName != 0){
            if(!doll.isEmpty()){
                if(doll.peek() == dollName){
                    dollCnt += 2;
                    doll.pop();
                }else{
                    doll.push(dollName);
                }
            }else{
                doll.push(dollName);
            }
        }
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        for(int i : moves){
            popDoll(pick(board, i));
        }
        answer = dollCnt;
        return answer;
    }
}