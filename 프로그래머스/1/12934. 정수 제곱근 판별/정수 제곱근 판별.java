class Solution {
    public long solution(long n) {
        // n의 제곱근을 구하고 정수로 변환
        long sqrt = (long) Math.sqrt(n);
        
        // sqrt를 제곱했을 때 원래 수 n과 같은지 확인
        if (sqrt * sqrt == n) {
            // 정수라면 (sqrt + 1)의 제곱 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 정수가 아니라면 -1 반환
            return -1;
        }
    }
}
