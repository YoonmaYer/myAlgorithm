class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num); // 주어진 숫자를 문자열로 변환
        int answer = -1; // 디폴트로 -1로 설정
        
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) - '0' == k) { // 문자를 숫자로 변환하여 비교
                answer = i + 1; // 숫자는 1부터 세기 때문에 인덱스에 1을 더해줌
                break; // 원하는 값이 발견되면 루프 탈출
            }
        }
        
        return answer;
    }
}
