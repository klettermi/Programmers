import java.util.Scanner;

public class Main {
    public Long solution(int n){
        if(n == 0) return 1L;
        else return n * solution(n-1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
