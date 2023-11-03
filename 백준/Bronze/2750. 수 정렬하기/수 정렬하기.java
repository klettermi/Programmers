import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int[] solution(int n, int[] arr){
        int idx, temp;
        for(int i = 0; i < arr.length; i++){
            idx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.valueOf(br.readLine());
        }

        for(int x : T.solution(n, arr)) System.out.println(x);

    }
}
