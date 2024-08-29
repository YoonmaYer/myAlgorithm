class Solution {
    public String solution(String myString) {
        // StringBuilder를 사용하여 결과 문자열을 효율적으로 생성
        StringBuilder answer = new StringBuilder();
        
        // 문자열의 각 문자에 대해 반복
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            
            // 현재 문자가 'l'보다 앞서는 문자라면 'l'로 변환
            if (currentChar < 'l') {
                answer.append('l');
            } else {
                answer.append(currentChar);
            }
        }
        
        // 최종 결과를 문자열로 변환하여 반환
        return answer.toString();
    }
}
