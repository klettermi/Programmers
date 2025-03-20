class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        
        while (index < s.length()) {
            int x = 1, y = 0;
            char first = s.charAt(index);
            
            for (int i = index + 1; i < s.length(); i++) {
                if (s.charAt(i) == first) {
                    x++;
                } else {
                    y++;
                }
                
                if (x == y) {
                    answer++;
                    index = i + 1; 
                    break;
                }
            }
            
            if (x != y) { 
                answer++;
                break;
            }
        }
        
        return answer;
    }
}