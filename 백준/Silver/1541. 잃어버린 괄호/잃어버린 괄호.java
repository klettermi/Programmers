import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("-");
        ArrayList<Integer> num = new ArrayList<>();

        for(String s : str){
            int cnt = 0;
            String[] str2 = s.split("\\+");
            for(String s2: str2)
                cnt += Integer.parseInt(s2);
            num.add(cnt);
        }

        int result = num.get(0);

        for(int i = 1; i < num.size(); i++)
            result -= num.get(i);

        System.out.println(result);
    }
}

