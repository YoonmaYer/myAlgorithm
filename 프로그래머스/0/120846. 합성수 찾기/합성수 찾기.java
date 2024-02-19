class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int factorCount = 0; // 약수의 개수를 세는 변수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factorCount++;
                }
            }
            if (factorCount >= 3) { // 약수의 개수가 3 이상인 경우 합성수
                answer++;
            }
        }
        
        return answer;
    }
}
