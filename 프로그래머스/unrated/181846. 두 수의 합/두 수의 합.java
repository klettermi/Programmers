import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger sum = a1.add(b1);
        return sum.toString();
    }
}