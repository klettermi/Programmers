class Solution {
    public static String func(String my_string, int[] query){
        String[] str = my_string.split("");
        String re = "";
        String ans = "";
        for(int i = query[1]; i >= query[0]; i--){
            re += str[i];
        }

        for(int i = 0; i < query[0]; i++)
            ans += str[i];
        ans += re;
        for(int i = query[1]+1; i < str.length; i++)
            ans += str[i];

        return ans;
    }
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i = 0; i < queries.length; i++){
            answer = func(answer, queries[i]);
        }
        return answer;
    }
}