class Solution {
    // 최대공약수
    public int gcd(int a, int b){
        int temp, n = 0;
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }

        while(b != 0){
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
    // 최소공배수
    public int lcm(int a, int b){
        return a / gcd(a, b) * b;
    }
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i : arr){
            lcm(answer, i);
            answer = lcm(answer, i);
        }
        return answer;
    }
}