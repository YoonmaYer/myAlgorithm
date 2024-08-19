class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 제곱근을 계산해서 제곱수인지 확인
            int sqrt = (int) Math.sqrt(i);
            
            // 제곱수일 경우 약수의 개수가 홀수
            if (sqrt * sqrt == i) {
                answer -= i; // 제곱수이므로 뺀다
            } else {
                answer += i; // 제곱수가 아니면 더한다
            }
        }

        return answer;
    }
}