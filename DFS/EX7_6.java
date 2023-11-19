package DFS;

public class EX7_6 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L == n+1){
            String temp = "";
            for(int i = 1; i <= n; i++){
                if(ch[i] == 1) temp += i+"";
            }
            if(temp.length() > 0) System.out.println(temp);
        }
        else{
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        EX7_6 T = new EX7_6();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
