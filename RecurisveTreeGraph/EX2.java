package RecurisveTreeGraph;

public class EX2 {
    static String answer = "";
    public static void main(String[] args) {
        solution(11);
        System.out.println(answer);
    }
    private static void solution(int n){
        DFS(n);
    }
    private static void DFS(int n){
        if(n == 0) return;
        else{
            answer = n%2 + answer;
            DFS(n/2);
        }
    }
}
