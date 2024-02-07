class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        boolean mode = false;

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);
            if (!mode) { // mode가 0인 경우
                if (currentChar == '1') {
                    mode = true; // mode를 0에서 1로 바꿈
                } else if (i % 2 == 0) {
                    ret += currentChar; // 짝수 인덱스에 해당하는 문자를 ret에 추가
                }
            } else { // mode가 1인 경우
                if (currentChar == '1') {
                    mode = false; // mode를 1에서 0으로 바꿈
                } else if (i % 2 == 1) {
                    ret += currentChar; // 홀수 인덱스에 해당하는 문자를 ret에 추가
                }
            }
        }
        
        if (ret.isEmpty()) {
            answer = "EMPTY"; // ret이 빈 문자열인 경우 "EMPTY" 반환
        } else {
            answer = ret;
        }

        return answer;
    }
}
