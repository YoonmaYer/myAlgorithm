public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 숫자를 문자열로 변환
        String numberString = String.valueOf(n);
        
        // 문자열의 각 문자에 대해 반복
        for (int i = 0; i < numberString.length(); i++) {
            // 각 문자를 숫자로 변환하여 더하기
            answer += Character.getNumericValue(numberString.charAt(i));
        }
        
        return answer;
    }
}