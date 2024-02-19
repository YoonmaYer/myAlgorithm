import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        // 문자열에서 숫자만 추출하여 리스트에 저장
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.add(Character.getNumericValue(c));
            }
        }
        
        // 오름차순 정렬
        Collections.sort(answer);
        
        return answer;
    }
}