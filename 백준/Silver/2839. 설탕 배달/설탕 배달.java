import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n >= 0){
            if(n % 5 ==0){
                answer += (n / 5);
                break;
            }else{
                n -= 3;
                answer++;
            }
        }
        if(n < 0)
            answer = -1;

        System.out.println(answer);
    }
}
