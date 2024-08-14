class Solution {
    public String solution(String s) {
        int len = s.length();
        int mid = len / 2;
        
        if (len % 2 == 0) {
            // 문자열 길이가 짝수일 경우 가운데 두 글자 반환
            return s.substring(mid - 1, mid + 1);
        } else {
            // 문자열 길이가 홀수일 경우 가운데 한 글자 반환
            return String.valueOf(s.charAt(mid));
        }
    }
}
