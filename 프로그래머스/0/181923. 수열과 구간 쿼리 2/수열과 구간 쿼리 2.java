class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        // 각 query를 처리
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];  // 시작 인덱스
            int e = queries[q][1];  // 종료 인덱스
            int k = queries[q][2];  // 기준 값

            int min = Integer.MAX_VALUE;  // k보다 큰 값 중 가장 작은 값 찾기 위한 변수
            boolean found = false;  // k보다 큰 값이 있는지 여부

            // s부터 e까지 범위 탐색
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                    found = true;
                }
            }

            // 만약 값을 찾았으면 min을, 찾지 못했으면 -1을 저장
            if (found) {
                result[q] = min;
            } else {
                result[q] = -1;
            }
        }

        return result;
    }
}