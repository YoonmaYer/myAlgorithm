class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = Integer.toString(k); // 숫자 k를 문자열로 변환
        
        for (int num = i; num <= j; num++) {
            String numStr = Integer.toString(num); // 현재 숫자를 문자열로 변환
            for (int idx = 0; idx < numStr.length(); idx++) {
                if (numStr.charAt(idx) == kStr.charAt(0)) { // 숫자 k가 등장하는지 확인
                    answer++;
                }
            }
        }
        
        return answer;
    }
}