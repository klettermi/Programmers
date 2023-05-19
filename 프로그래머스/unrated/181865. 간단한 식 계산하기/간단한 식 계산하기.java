class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] func = binomial.split(" ");
        
        int a = Integer.parseInt(func[0].trim());
        int b = Integer.parseInt(func[2].trim());
        
        switch(func[1]){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        return answer;
    }
}