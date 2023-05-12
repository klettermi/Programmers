class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int j = 0; j < my_string.length(); j++){
            int i = (int)(my_string.charAt(j));
            if(i >= 65 && i <= 90)
                answer[i-65] += 1;
            else if(i >= 97 && i <= 122)
                answer[i-97+26] += 1;
        }
        return answer;
    }
}