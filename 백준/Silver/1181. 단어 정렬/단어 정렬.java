import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = br.readLine();
        }

        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length())
                 return s1.compareTo(s2);
                else return s1.length()- s2.length();
            }
        });

        System.out.println(str[0]);
        for(int i = 1; i < n; i++){
            if(!str[i].equals(str[i - 1]))
                System.out.println(str[i]);
        }
    }
}
