import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 공백을 기준으로 문자열을 나누어 배열로 변환
        String[] arr = s.split(" ");
        List<String> strList = new ArrayList<>(Arrays.asList(arr));
        
        // 누적합 계산
        for(int i = 0; i < strList.size(); i++) {
            // "Z"가 나오면 바로 전에 더했던 숫자를 빼야 함
            if(strList.get(i).equals("Z")) {
                // "Z"가 나온 경우, 현재 인덱스와 그 직전 인덱스의 숫자를 빼고, 해당 숫자들을 리스트에서 제거
                int prevNum = Integer.parseInt(strList.get(i - 1));
                answer -= prevNum;
                strList.remove(i); // "Z" 제거
                strList.remove(i - 1); // 이전 숫자 제거
                // 인덱스를 갱신
                i -= 2;
            } else {
                // "Z"가 아닌 경우 숫자를 더함
                answer += Integer.parseInt(strList.get(i));
            }
        }
        
        return answer;
    }
}
