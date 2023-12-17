import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static private int sumArray(ArrayList<Integer> arr){
        int sum = 0;
        boolean[] ch = new boolean[arr.size()];
        for(int i = 0; i < arr.size()-1; i++){
            if(ch[i]) continue;
            if(arr.get(i+1) == 1){
                sum += 1;
                ch[i+1] = true;
            }else{
                ch[i] = ch[i+1] = true;
                if(arr.get(i) == 1 && arr.get(i+1) == 1) sum += 2;
                else sum += arr.get(i) * arr.get(i+1);
            }
        }
        for(int i = 0; i < ch.length; i++){
            if(!ch[i]) sum += arr.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> up = new ArrayList<>();
        ArrayList<Integer> down = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a <= 1) down.add(a);
            else up.add(a);
        }

        Collections.sort(up, Collections.reverseOrder());
        Collections.sort(down);

        int answer = 0;
        answer += sumArray(up);
        answer += sumArray(down);
        System.out.println(answer);
    }
}
