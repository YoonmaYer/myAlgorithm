class Solution {
    public boolean solution(String s) {
        // 문자열의 길이가 4 또는 6이 아니면 false 반환
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        // 문자열의 각 문자가 숫자인지 확인
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false; // 숫자가 아닌 문자가 발견되면 false 반환
            }
        }
        
        // 모든 조건을 만족하면 true 반환
        return true;
    }
}