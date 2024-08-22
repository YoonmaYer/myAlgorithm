class Solution {
    public int solution(int n) {
        int result = 0;  // 결과값을 저장할 변수 초기화
        
        while (n > 0) {  // n이 0이 될 때까지 반복
            result++;  // result를 1 증가
            
            // result에 숫자 '3'이 포함되거나, result가 3의 배수라면
            if ((""+result).contains("3") || result % 3 == 0)
                continue;  // 다음 반복으로 넘어가서 n을 감소시키지 않음
            
            n--;  // 위의 조건에 걸리지 않은 경우에만 n을 1 감소
        }
        
        return result;  // n이 0이 될 때까지의 최종 result 값 반환
    }
}