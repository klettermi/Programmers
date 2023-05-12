import java.util.ArrayList;

class Solution {
    public String[] func(String my_string){
        ArrayList <String> prefix = new ArrayList <String> ();
        for(int i = 0; i < my_string.length()+1; i++){
            prefix.add(my_string.substring(0, i));
        }
        String[] ans = new String[prefix.size()];
        for(int i = 0; i < ans.length; i++)
            ans[i] = prefix.get(i);
        return ans;
    }
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(String s : func(my_string)){
            if(is_prefix.equals(s)){
                answer = 1;
                break;
            }else{
                answer = 0;   
            }
        }
        return answer;
    }
}