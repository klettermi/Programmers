class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] ans = n_str.split("");
        int flag = 0;
        for(int i = 0; i < ans.length; i++){
            if(!ans[i].equals("0")){
                flag = i;
                break;
            }
        }
        for(int i = flag; i < ans.length; i++)
            answer += ans[i];
        return answer;
    }
}