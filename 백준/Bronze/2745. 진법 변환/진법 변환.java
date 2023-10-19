import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            int num  = 0;
            char c = s.charAt(s.length()-1 -i);
            if(c >= 65){
                num = (int)c - 55;
            }else{
                num = Integer.parseInt(String.valueOf(c));
            }

            answer += num * Math.pow(n, i);
        }

        System.out.println(answer);
    }
}
