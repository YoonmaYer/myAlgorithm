class Solution {
    public int[] solution(long n) {
        // 숫자를 문자열로 변환
        String numberStr = Long.toString(n);
        
        // 역순으로 숫자를 저장할 배열 생성
        int[] answer = new int[numberStr.length()];
        
        // 문자열을 역순으로 반복
        for (int i = 0; i < numberStr.length(); i++) {
            // 문자를 정수로 변환하여 배열에 저장
            answer[i] = numberStr.charAt(numberStr.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}