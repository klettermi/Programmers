import java.util.ArrayList;
class Solution {
     // 숫자인지 확인하는 메서드
    public static boolean isNumber(char s){
        try{
            Integer.parseInt(String.valueOf(s));
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    // 점수로 나누기 {1S, 2D, *, 3T}
    public static ArrayList<String> makeScore(String dartResult){
        String s = "";
        ArrayList<String> midArray = new ArrayList<>();
        for(int i = 0; i < dartResult.length(); i++){
            if(isNumber(dartResult.charAt(i))){
                s += dartResult.charAt(i);
            }
            else{
                s += dartResult.charAt(i);
                midArray.add(s);
                s = "";
            }
        }

        return midArray;
    }

    // 숫자로 바꾸기
    public static ArrayList<String> makeNumber(ArrayList<String> midArray){

        ArrayList<String> finArray = new ArrayList<>();
        for(int i = 0; i < midArray.size(); i++){
            int num = 0;
            String sample = "";
            for(int j = 0; j < midArray.get(i).length(); j++){
                if(isNumber(midArray.get(i).charAt(j))){
                    sample += midArray.get(i).charAt(j);
                }
                else if(midArray.get(i).charAt(j) == 'S'){
                    num = Integer.parseInt(sample);
                    finArray.add(num + "");
                }else if(midArray.get(i).charAt(j) == 'D'){
                    num = Integer.parseInt(sample);
                    finArray.add((int)Math.pow(num, 2) + "");
                }else if(midArray.get(i).charAt(j) == 'T'){
                    num = Integer.parseInt(sample);
                    finArray.add((int)Math.pow(num, 3) + "");
                }else{
                    String op = finArray.get(finArray.size()-1) + midArray.get(i).charAt(j);
                    finArray.set(finArray.size()-1, op);
                }
            }
        }

        return finArray;
    }
    public static int solution(String dartResult) {
        int answer = 0;
        ArrayList<String> finArray = makeNumber(makeScore(dartResult));
        String[] lastCal = finArray.toArray(new String[finArray.size()]);
        int past = 0;
        for(int i = 0; i < lastCal.length; i++){
            if(lastCal[i].contains("*")){
                answer = answer + past + 2 * Integer.parseInt(lastCal[i].replace("*",""));
                past = 2 * Integer.parseInt(lastCal[i].replace("*",""));
            }else if(lastCal[i].contains("#")){
                answer -= Integer.parseInt(lastCal[i].replace("#",""));
                past = -1 * Integer.parseInt(lastCal[i].replace("#",""));
            }else{
                past = Integer.parseInt(lastCal[i]);
                answer += Integer.parseInt(lastCal[i]);
            }
            
        }
        return answer;
    }
}