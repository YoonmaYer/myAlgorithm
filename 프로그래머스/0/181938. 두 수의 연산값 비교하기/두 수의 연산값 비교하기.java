class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result = Integer.parseInt("" + a + b);
        int result2 = 2 * a * b;
        
        if (result > result2) {
            answer = result;
        } else if (result < result2) {
            answer = result2;
        } else {
            return 1;
        }
        
        return answer;
    }
}