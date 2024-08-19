class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행과 열 크기가 arr1과 arr2는 같다고 가정
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        // 이중 for문을 사용해 각 요소를 더한다
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                // arr1과 arr2의 각 요소를 더해 answer에 저장
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
