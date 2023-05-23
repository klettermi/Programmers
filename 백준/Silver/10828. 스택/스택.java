import java.util.*;
public class Main {
    public static ArrayList <Integer> arr = new ArrayList <Integer>();
    public static void push(int n){
        arr.add(n);
    }
    public static int pop(){
        int answer = -1;
        if(arr.isEmpty())
            return -1;
        else{
            answer = arr.get(size()-1);
            arr.remove(arr.size()-1);
            return answer;
        }
    }
    public static int size(){
        return arr.size();
    }
    public static int empty(){
        if(arr.isEmpty()) return 1;
        else return 0;
    }
    public static int top(){
        if(arr.isEmpty()) return -1;
        else return arr.get(size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String s = sc.next();

            switch (s){
                case "push":
                    int x = sc.nextInt();
                    push(x);
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
