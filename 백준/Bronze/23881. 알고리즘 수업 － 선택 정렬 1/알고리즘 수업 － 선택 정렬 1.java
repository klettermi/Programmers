import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        for(int i=n-1;i>0;i--) {
            int m=0, idx=0;
            for(int j=0;j<=i;j++) {
                if(m<a[j]) {
                    m=a[j];
                    idx=j;
                }
            }
            if(a[i]!=m) {
                int t=a[i];
                a[i]=a[idx];
                a[idx]=t;
                cnt++;
                if(cnt==k) {
                    System.out.println(Math.min(a[i], a[idx])+" "+Math.max(a[i], a[idx]));
                    break;
                }
            }
        }
        if(cnt<k)
            System.out.println("-1");

    }
}
