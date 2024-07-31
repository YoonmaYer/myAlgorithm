class Solution {
    public String solution(String my_string, int n) {
        // 문자열의 길이
        int length = my_string.length();
        // 뒤의 n글자를 추출
        String answer = my_string.substring(length - n);
        return answer;
    }
}