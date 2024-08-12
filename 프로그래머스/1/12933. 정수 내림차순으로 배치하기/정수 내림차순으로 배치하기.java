import java.util.*;

class Solution {
    public long solution(long n) {
        // 1. 정수 n을 문자열로 변환하여 각 자릿수를 분리합니다.
        String[] digits = String.valueOf(n).split("");

        // 2. 각 자릿수를 내림차순으로 정렬합니다.
        Arrays.sort(digits, Collections.reverseOrder());

        // 3. 정렬된 문자열 배열을 합쳐서 새로운 문자열로 만듭니다.
        StringBuilder sortedNumber = new StringBuilder();
        for (String digit : digits) {
            sortedNumber.append(digit);
        }

        // 4. 정렬된 문자열을 long 타입으로 변환하여 반환합니다.
        return Long.parseLong(sortedNumber.toString());
    }
}