package RecurisveTreeGraph;

public class EX1 {
    static String answer = "";
    public static void main(String[] args) {
        solution(3);
    }
    private static void solution(int n){
        DFS(n);
    }
    private static void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}
