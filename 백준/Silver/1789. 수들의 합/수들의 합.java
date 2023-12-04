import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long sum = 0L;
        int cnt = 0;
        for(Long i = 1L; ; i++){
            if(sum > n) break;
            sum += i;
            cnt++;
        }
        System.out.println(cnt-1);
    }
}
