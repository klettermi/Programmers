import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int[] ch = new int[10];
        for(String s : str){
            int idx = Integer.parseInt(s);
            ch[idx]++;
        }
        if((ch[6] + ch[9]) % 2 == 0) ch[6] = (ch[6] + ch[9]) / 2;
        else ch[6] = (ch[6] + ch[9]) / 2 + 1;
        
        int max = ch[0];
        for(int i = 0; i <= 8; i++){
            if(max < ch[i]) max = ch[i];
        }
        System.out.println(max);
    }
}
