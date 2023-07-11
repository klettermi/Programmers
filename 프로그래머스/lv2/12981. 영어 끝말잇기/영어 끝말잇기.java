import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashSet<String> hash = new HashSet<>();

        hash.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(hash.contains(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || words[i].length()==1){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }else if(!hash.contains(words[i])){
                hash.add(words[i]);
            }
        }

        return answer;
    }
}