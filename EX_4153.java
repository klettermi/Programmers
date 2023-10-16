import java.util.Scanner;

public class EX_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            if(sc.nextInt() == 0) break;

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = a;
            if(b > max && c < max) max = b;
            else if(c > max && b < max) max = c;

        }
    }
}
