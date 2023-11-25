package RecurisveTreeGraph;

public class EX4 {
    static int[] arr;
    public static void main(String[] args) {
        int n = 45;
        arr = new int[n+1];

        for(int i = 1;i <= 10; i++) System.out.print(fibo(i) + " ");
    }
    private static int fibo(int n){
        if(arr[n] > 0) return arr[n];
        if(n == 1 || n == 2) return 1;
        else return arr[n] = fibo(n-1) + fibo(n-2);
    }
}
