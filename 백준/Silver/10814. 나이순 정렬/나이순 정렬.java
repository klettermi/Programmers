import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Member{
        int age;
        String name;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Member[] members = new Member[n];
        for(int i = 0; i < n; i++){
            members[i] = new Member();
            members[i].age = sc.nextInt();
            members[i].name = sc.next();
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.println(members[i].age + " " + members[i].name);
        }

    }
}
