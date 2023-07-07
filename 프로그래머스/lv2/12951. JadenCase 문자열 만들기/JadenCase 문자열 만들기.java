class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split(" ");

        for(int i = 0; i < sList.length; i++){
            if(sList[i].length() == 0) answer += " ";
            else {
                if ((sList[i].charAt(0) + "").matches("[a-z]")) answer += (sList[i].charAt(0) + "").toUpperCase();
                else answer += sList[i].charAt(0) + "";
                for (int k = 1; k < sList[i].length(); k++){
                    answer += (sList[i].charAt(k) + "").toLowerCase();
                }
                if(i != sList.length-1) answer += " ";
            }
        }
        answer += " " .repeat(s.length()-answer.length());
        return answer;
    }
}