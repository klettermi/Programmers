import java.util.Scanner;

public class Main {
    public int solution(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
