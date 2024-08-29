import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        // 공백을 기준으로 문자열을 나누고, 최소값과 최대값을 구하는 변수 초기화
        StringTokenizer st = new StringTokenizer(s, " ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // 토큰을 하나씩 처리하면서 최소값과 최대값 갱신
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // "(최소값) (최대값)" 형식으로 반환
        return min + " " + max;
    }
}
