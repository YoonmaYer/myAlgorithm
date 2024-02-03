class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
       int commonNumer1 = numer1 * denom2; //분자1
        int commonNumer2 = numer2 * denom1; //분자2
        int commonNumer = commonNumer1+commonNumer2; //분자의 덧셈
        int commonDen = denom1 * denom2; //통분
        
        int gcd = 0;
        
        for (int i = 1; i <= commonNumer && i <= commonDen; i++) {
            if (commonNumer % i == 0 && commonDen % i == 0) {
                gcd = i;
            }   
        }
            
        commonNumer = commonNumer/gcd; // 기약분수 분자
        commonDen = commonDen/gcd; // 기약분수 분모
        
        int[] answer = {commonNumer, commonDen};
        
        
            
        
        
        
        return answer;
    }
}