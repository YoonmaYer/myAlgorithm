class Solution {
    public String[] solution(String my_str, int n) {
        // 저장할 배열의 크기 계산
        int arrayLength = (int) Math.ceil((double) my_str.length() / n);
        String[] answer = new String[arrayLength];
        
        // 문자열을 일정 길이로 잘라서 배열에 저장
        for (int i = 0; i < arrayLength; i++) {
            if ((i+1) * n <= my_str.length()) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            } else {
                answer[i] = my_str.substring(i * n);
            }
        }
        
        return answer;
    }
}
