class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderString = Integer.toString(order);
        
        for (int i = 0; i < orderString.length(); i++) {
            char digit = orderString.charAt(i);
            if (digit == '3' || digit == '6' || digit == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}
