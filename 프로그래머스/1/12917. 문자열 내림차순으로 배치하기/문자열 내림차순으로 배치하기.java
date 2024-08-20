import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 1. 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();
        
        // 2. 배열을 정렬 (기본적으로 오름차순이므로 이를 뒤집을 예정)
        Arrays.sort(charArray);
        
        // 3. 정렬된 배열을 뒤집어 큰 것부터 작은 순으로 재배열
        StringBuilder sb = new StringBuilder(new String(charArray));
        
        // 4. 뒤집어서 반환
        return sb.reverse().toString();
    }
}