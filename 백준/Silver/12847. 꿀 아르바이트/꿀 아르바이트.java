import java.util.Scanner;

public class Main {
    public Long solution(int n, int m, Long[] work){
        Long sum = 0L;
        Long answer = 0L;
        for(int i = 0; i < m; i++){
            sum += work[i];
        }
        answer = sum;
        for(int i = m; i < n; i++){
            sum += (work[i]-work[i-m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T  = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Long[] work = new Long[n];
        for(int i = 0; i < n; i++){
            work[i] = sc.nextLong();
        }

        System.out.println(T.solution(n, m, work));
    }
}
