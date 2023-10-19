import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public String solution(String[] arr){
        String answer = "";
        String[][] strings = new String[5][15];
        for(int i = 0; i < strings.length; i++){
            String[] sArr = arr[i].split("");
            for(int j = 0; j < sArr.length; j++){
                strings[i][j] = sArr[j];
            }
        }

        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(strings[i][j] != null) answer += strings[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.next();
        }

        System.out.println(T.solution(arr));
    }
}
