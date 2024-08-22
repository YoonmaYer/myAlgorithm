class Solution {
    public int solution(String[] babbling) {
        int result = 0;  // 결과를 저장할 변수 초기화
        String[] validWords = {"aya", "ye", "woo", "ma"};  // 유효한 단어 리스트
        
        // 입력 배열 babbling의 각 문자열을 순회
        for (String babble : babbling) {
            // 유효한 단어들을 순회하면서 문자열에서 제거
            for (String word : validWords) {
                // 문자열에 유효한 단어가 포함되어 있으면
                if (babble.indexOf(word) > -1) {
                    // 유효한 단어를 빈칸으로 대체
                    babble = babble.replace(word, " ");
                }
            }
            // 모든 유효한 단어가 제거된 후, 문자열이 빈칸으로만 이루어져 있는지 확인
            if (babble.trim().length() == 0) {
                result++;  // 유효한 단어만 있는 경우 카운트 증가
            }
        }
        
        return result;  // 최종 결과 반환
    }
}