import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        HashSet<String> phoneSet = new HashSet<>();
        
        for (String phone : phone_book){
            phoneSet.add(phone);
        }
        
        for (String number : phone_book) {
            String temp = "";
            for (int i = 0; i < number.length() - 1; i++){
                temp += number.charAt(i);
                if (phoneSet.contains(temp)) return false;
            }
        }
        return true;
    }
}