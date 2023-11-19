import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(String word) {
        int count = 0;
        int rt = 0, lt = word.length() - 1;
        while (rt < lt) {
            if (word.charAt(rt) == word.charAt(lt)) {
                rt++;
                lt--;
            } else {
                boolean flag = false;
                count++;
                if (word.charAt(rt) == word.charAt(lt - 1) && word.charAt(rt + 1) != word.charAt(lt)) {
                    lt--;
                } else if (word.charAt(rt) != word.charAt(lt - 1) && word.charAt(rt + 1) == word.charAt(lt)) {
                    rt++;
                } else if (word.charAt(rt) != word.charAt(lt - 1) && word.charAt(rt + 1) != word.charAt(lt)) {
                    return 2;
                } else {
                    int nrt = rt;
                    int nlt = lt;
                    if (word.charAt(rt) == word.charAt(lt - 1)) {
                        lt--;
                        while (rt < lt) {
                            if (word.charAt(rt) == word.charAt(lt)) {
                                rt++;
                                lt--;
                            } else {
                                count++;
                                flag = true;
                                break;
                            }
                        }
                        if(flag){
                            count--;
                            rt = nrt;
                            lt = nlt;
                        }

                    }
                    if (word.charAt(rt+1) == word.charAt(lt)) {
                        flag = false;
                        rt++;
                        while (rt < lt) {
                            if (word.charAt(rt) == word.charAt(lt)) {
                                rt++;
                                lt--;
                            } else {
                                count++;
                                flag = true;
                                break;
                            }
                        }
                        if(flag){
                            count--;
                            rt = nrt;
                            lt = nlt;
                        }
                    }
                }
            }
            if(count > 1) return 2;
        }
        if(count == 1) return 1;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = br.readLine();
        }

        for(String s : words) System.out.println(T.solution(s));
    }
}
