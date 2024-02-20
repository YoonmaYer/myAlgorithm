class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 주어진 변들이 삼각형을 이룰 수 있는지 확인
        if (sides[0] + sides[1] > sides[2] && sides[1] + sides[2] > sides[0] && sides[0] + sides[2] > sides[1]) {
            answer = 1; // 삼각형을 만들 수 있는 경우
        } else {
            answer = 2; // 삼각형을 만들 수 없는 경우
        }
        
        return answer;
    }
}
