import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/*
 * Making Triangular
 * input: 정수 n (0 <= n <= 100)
 * output: n줄만큼 "*"로 이루어진 삼각형 출력
 *         최상단의 별은 1개, 모든 줄의 별의 갯수는 홀수
 */
public class EX2 {
//    public static void main(String[] args) {
//        String s = "월,6,목6(60주년기념관 209)";
//
//        int locationIdx = s.indexOf("(");
//        s = s.substring(0,locationIdx);
//        String ans = "";
//        String[] lis = s.split(",");
//        for(String str : lis){
//            if(str.length() == 1){
//                ans += str;
//            }else{
//                ans = ans + "," + str;
//            }
//        }
//        System.out.println(ans);
//    }
//public static void main(String[] args) {
////    String s = "월,6,목12(60주년기념관 209)";
//    String s = "화,8,9(미래관 303),수8,9(공1호관 208)";
//    int locationIdx = s.indexOf("(");
//    s = s.substring(0,locationIdx);
//
//    String ans = "";
//    for (String day : s.split(",")) {
//        if (day.length() == 1 || isInteger(day)) {
//            ans += day;
//        } else {
//            ans += "," + day;
//        }
//    }
//
//    System.out.println(ans);
//}
public static void main(String[] args) {
//    String s = "월,6,목12(60주년기념관 209)";
    String timetable = "월3,목3(사회과학2호관 229)";
//   화 8 9,수 8 9
    String ans = "";

    LinkedList<String> fList = new LinkedList<>();
    String[] list = timetable.split(",");
    for(int i = 0; i < list.length; i++){
        // 공백 제거
        list[i].trim();
        // 장소 제거
        if(list[i].contains("(")){
            list[i] = list[i].substring(0, list[i].indexOf("("));
        }
        // 여러글자면 나눠주기
        if(list[i].length() != 1 && !isInteger(list[i])){
            fList.add(list[i].substring(0,1));
            fList.add(list[i].substring(1));
        }else if(list[i].length() == 1 ||isInteger(list[i])){
            fList.add(list[i]);
        }
    }

    ans += fList.get(0);

    for(int i = 1; i < fList.size(); i++){
        if(isInteger(fList.get(i))){
            ans += " " + fList.get(i);
        }else{
            ans += "," + fList.get(i);
        }
    }
    System.out.println(ans);
}
public static boolean isInteger(String strValue){
    try{
        Integer.parseInt(strValue);
        return true;
    }catch (NumberFormatException e){
        return false;
    }
}
}
