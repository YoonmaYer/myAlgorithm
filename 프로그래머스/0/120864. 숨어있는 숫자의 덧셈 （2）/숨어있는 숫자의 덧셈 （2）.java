class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int currentNumber = 0;
        boolean inNumber = false;
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                inNumber = true;
            } else {
                if (inNumber) {
                    answer += currentNumber;
                    currentNumber = 0;
                    inNumber = false;
                }
            }
        }
        
        if (inNumber) {
            answer += currentNumber;
        }
        
        return answer;
    }
}