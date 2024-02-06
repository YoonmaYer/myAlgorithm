class Solution {
    public int solution(int a, int b) {
        String result1 = String.valueOf(a) + String.valueOf(b);
        String result2 = String.valueOf(b) + String.valueOf(a);
        
        int answer;
        
        if (result1.compareTo(result2) > 0) {
            answer = Integer.parseInt(result1);
        } else if (result1.compareTo(result2) < 0) {
            answer = Integer.parseInt(result2);
        } else {
            answer = Integer.parseInt(result1);
        }
        return answer;
    }
}
