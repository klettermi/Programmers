class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split(" ");
        int min, max, n;

        min =  max = Integer.valueOf(sList[0]);
        for(String k : sList ){
            n = Integer.valueOf(k);
            if(min > n) min = n;
            if(max < n) max = n;
         }
        answer = min + " " + max;
        return answer;
    }
}