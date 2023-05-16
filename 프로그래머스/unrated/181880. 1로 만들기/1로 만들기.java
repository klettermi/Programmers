class Solution {
    public int func(int num){
        int ans = 0;
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
                ans++;
            }
            else{
                num = (num-1)/2;
                ans++;
            }
        }
        return ans;
    }
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i : num_list){
            answer += func(i);
        }
        return answer;
    }
}