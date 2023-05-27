import java.util.*;
public class Main {
    public static boolean six(int n){
        return (n + "").contains("666");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int start = 666;

        while(true){
            if(six(start) && cnt == n) break;
            
            else if(six(start) && cnt != n) {
                cnt++;
                start++;
            }
            else start++;
            
        }
        System.out.println(start);
    }
}
