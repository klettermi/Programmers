class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        int k = 0;
        while(Math.pow(2, i) < arr.length){
            i++;
        }
        k = (int)(Math.pow(2, i));
        int[] answer = new int[k];
        for(int j = 0; j < arr.length; j++)
            answer[j] = arr[j];
        return answer;
    }
}