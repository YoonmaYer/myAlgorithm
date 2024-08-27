import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 결과를 저장할 배열 선언
        int[] answer = new int[commands.length];
        
        // 각 명령(commands)을 하나씩 처리
        for (int i = 0; i < commands.length; i++) {
            // commands[i][0]부터 commands[i][1]까지 자르기 (1-based index, 그래서 -1 필요)
            int[] slicedArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            
            // 자른 배열 정렬
            Arrays.sort(slicedArr);
            
            // 정렬된 배열에서 commands[i][2]번째 숫자를 찾아 저장 (1-based index라서 -1)
            answer[i] = slicedArr[commands[i][2] - 1];
        }
        
        return answer;
    }
}