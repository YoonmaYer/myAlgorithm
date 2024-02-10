class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2]; // n 이하의 홀수 개수만큼 배열 크기 설정
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 2 * i + 1; // 홀수를 만들기 위해 2를 곱하고 1을 더함
        }
        
        return answer;
    }
}
