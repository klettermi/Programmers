class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        // sum의 약수 구하기
        for(int i = 1; i <= Math.sqrt(sum); i++){
            if(sum % i == 0 && (2 * (i + sum/i -2)) == brown){
                answer[1] = i;
                answer[0] = sum/i;
            }
        }
        return answer;
    }
}