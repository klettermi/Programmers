import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
       int idx = -1;

       for(int i = 0; i < str_list.length; i++){
           if(str_list[i].equals("l") || str_list[i].equals("r")){
               idx = i;
               break;
           }
       }

       char flag;
        if(idx != -1){
            flag = str_list[idx].equals("l")? 'l' : str_list[idx].equals("r")? 'r' : 'n';
        }else{
            flag = 'n';
        }

       ArrayList <String> ans = new ArrayList <String> ();

       switch(flag){
           case 'l':
               for(int i = 0; i < idx; i++)
                   ans.add(str_list[i]);
               break;
           case 'r':
               for(int i = idx + 1; i < str_list.length; i++)
                   ans.add(str_list[i]);
               break;

       }

       String[] answer = new String[ans.size()];
       for(int i = 0; i < ans.size(); i++)
           answer[i] = ans.get(i);
        return answer;
    }
}