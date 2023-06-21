import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    // 십진법 배열을 이진법 배열로 바꾸는 방법
    public static Integer[] makeBinary(int n){
        String s = Integer.toBinaryString(n);

        Integer[] bi_arr = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            bi_arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return bi_arr;
    }
    // 배열 중 max값 찾는 메소드
    public static int max(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max) max = i;
        }
        return max;
    }

    // 각 지도를 2차원 배열로 만드는 메소드
    public static int[][] make2DArry(int[] arr){
        ArrayList <Integer[]> ls = new ArrayList<>();
        for(int i : arr){
            ls.add(makeBinary(i));
        }
        int max_size = makeBinary(max(arr)).length;
        int[][] two_arr = new int [ls.size()][max_size];

        for(int i = 0; i < ls.size(); i++){
            if(ls.get(i).length < max_size){
                Arrays.fill(two_arr[i], 0, max_size - ls.get(i).length, 0);
                for(int j = 0; j < ls.get(i).length; j++){
                   two_arr[i][max_size - ls.get(i).length + j] = ls.get(i)[j];
                }
            }else{
                for(int j = 0; j < ls.get(i).length; j++){
                    two_arr[i][j] = ls.get(i)[j];
                }
            }
        }

        return two_arr;
    }

    // 두 배열을 합치는 메소드
    public static int[][] addArray(int[][] arr1, int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                if(arr1[i][j] == 0 && arr2[i][j] == 0)
                    sum[i][j] = 0;
                else sum[i][j] = 1;
            }
        }
        return sum;
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] final_arr = addArray(make2DArry(arr1), make2DArry(arr2));
        for(int i = 0; i < final_arr.length; i++){
            String s = "";
            for(int j = 0; j < final_arr[i].length; j++){
                if(final_arr[i][j] == 1) s += "#";
                else s += " ";
            }
            answer[i] = s;
        }
        return answer;
    }
}