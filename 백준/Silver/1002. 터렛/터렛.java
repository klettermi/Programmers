import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(cnt(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int cnt(int x1, int y1, int r1, int x2, int y2, int r2){
        int count = 0;
        int v = (int)Math.pow((x1-x2),2) + (int)Math.pow((y1-y2),2); // 사이의 거리

        // 원이 같을 때
        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;
        // 접하지 않을 때
        else if(Math.pow(r1 + r2, 2) < v) return 0;
        //원 안에 원이 있는데 접하지 않을 때
        else if(v < Math.pow(r1 - r2, 2)) return 0;
        // 내접할 때
        else if(v == Math.pow(r1 - r2, 2)) return 1;
        // 한 곳이 외접할 때
        else if(Math.pow(r1 + r2,2) == v) return 1;
        //  두 곳이 외접할 때
        else return 2;

    }
}
