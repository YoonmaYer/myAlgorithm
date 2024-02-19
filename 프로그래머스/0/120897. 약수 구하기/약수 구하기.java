class Solution {
    public int[] solution(int n) {
        int count = 0;
        
        // 약수의 개수를 세기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        // 새로운 배열을 약수의 개수만큼 생성
        int[] answer = new int[count];
        int index = 0; // 배열의 인덱스
        
        // 약수를 배열에 채우기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index++] = i;
            }
        }
        
        return answer;
    }
}
