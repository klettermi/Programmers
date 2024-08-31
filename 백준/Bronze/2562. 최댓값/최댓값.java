import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

       int[] arr2 = arr.clone();

        Arrays.sort(arr2);

        for (int j = 0; j < 9; j++){
            if (arr[j] == arr2[8]){
                System.out.println(arr[j]);
                System.out.println(j+1);
            }
        }

    }
}