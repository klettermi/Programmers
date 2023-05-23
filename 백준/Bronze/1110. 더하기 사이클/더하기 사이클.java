import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(cycle(n));
    }
    public static int cycle(int n){
        int cnt = 0; // 사이클 수
        int new_n = 0; // 새로운 수
        int ten = n / 10; // 십의 자리수
        int one = n % 10; // 일의 자리수

        // 새로운 수 만들기
        while(true){
            cnt++;
            if(ten + one >= 10){
                new_n = one * 10 + (ten + one) % 10;
            }else new_n = one * 10 + (ten + one);

            if(n == new_n) break;

            ten = new_n / 10; // 십의 자리수
            one = new_n % 10; // 일의 자리수
        }

        return cnt;
    }
}
