import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] my = my_string.split("");
        ArrayList <String> str = new ArrayList <String> ();
        for(int i = c-1; i < my_string.length(); i += m)
            str.add(my[i]);
        for(String s: str)
            answer += s;
        return answer;
    }
}