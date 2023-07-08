class Solution {
    private static int[] fibo = new int[1000001];
    public int solution(int n) {
        int answer = 0;
        answer = fibonacci(n);
        return answer;
    }

    public int fibonacci(int n){
        if(fibo[n] != 0){

        }else{
            if(n <= 2)
                fibo[n] = 1;
            else{
                fibo[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        return fibo[n] % 1234567;
    }
}