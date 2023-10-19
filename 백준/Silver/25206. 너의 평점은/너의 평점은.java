import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public double solution(ArrayList<String> arr){
        double grade = 0;
        double score = 0;

        for(String s : arr){
            if(!s.split(" ")[2].equals("P")){
                grade += Double.parseDouble(s.split(" ")[1]);
                score += Double.parseDouble(s.split(" ")[1]) * score(s.split(" ")[2]);
            }
        }
        if(score == 0 || grade == 0) return 0;

        return score/grade;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            arr.add(sc.nextLine());
        }
        System.out.println(T.solution(arr));
    }


    private double score(String s){
        switch (s){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0;
            default: return 0;
        }
    }
}
