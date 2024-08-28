import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        // BigInteger를 사용하여 GCD 계산
        int gcdValue = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        // LCM 계산
        int lcmValue = (n * m) / gcdValue;
        
        // 결과 배열에 GCD와 LCM을 저장
        int[] answer = {gcdValue, lcmValue};
        return answer;
    }
}
