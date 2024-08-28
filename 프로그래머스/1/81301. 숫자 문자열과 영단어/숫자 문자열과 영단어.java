import java.util.HashMap;

public class Solution {
    public static int solution(String s) {
        // 숫자 단어와 숫자의 매핑을 위한 HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        // 변환된 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 단어를 저장할 임시 문자열
        StringBuilder temp = new StringBuilder();

        // 문자열을 한 글자씩 탐색
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 숫자가 나오면 바로 결과에 추가
            if (Character.isDigit(ch)) {
                result.append(ch);
            } else {
                // 문자가 나오면 임시 문자열에 추가
                temp.append(ch);

                // 임시 문자열이 숫자 단어와 일치하면 변환
                if (map.containsKey(temp.toString())) {
                    result.append(map.get(temp.toString()));  // 숫자로 변환하여 추가
                    temp.setLength(0);  // 임시 문자열 초기화
                }
            }
        }

        // 결과를 정수로 변환하여 반환
        return Integer.parseInt(result.toString());
    }
}