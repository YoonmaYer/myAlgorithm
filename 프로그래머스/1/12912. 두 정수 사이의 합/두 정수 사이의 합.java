class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 더 작은 값과 큰 값을 결정합니다
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        
        // start부터 end까지 합을 계산합니다
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        
        return answer;
    }
}