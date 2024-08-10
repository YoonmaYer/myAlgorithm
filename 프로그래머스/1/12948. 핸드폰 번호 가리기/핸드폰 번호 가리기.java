class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int length = phone_number.length();
        
        // 마지막 4자리 전까지는 '*'로 대체
        for (int i = 0; i < length - 4; i++) {
            answer.append("*");
        }
        
        // 마지막 4자리는 그대로 추가
        answer.append(phone_number.substring(length - 4));
        
        return answer.toString();
    }
}
