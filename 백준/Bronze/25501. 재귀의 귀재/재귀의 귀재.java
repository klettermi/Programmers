import java.util.Scanner;

public class Main {
    static int count;
    public int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.next();
        }

        for(String s : words){
            count = 0;
            System.out.println(T.recursion(s, 0, s.length() - 1)+ " " + count);
        }
    }
}
